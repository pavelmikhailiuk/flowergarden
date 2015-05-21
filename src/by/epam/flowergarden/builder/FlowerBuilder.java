package by.epam.flowergarden.builder;


import by.epam.flowergarden.entity.CutFlower;
import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.entity.LightingLevel;
import by.epam.flowergarden.entity.PotFlower;
import by.epam.flowergarden.exception.ArgumentException;
import by.epam.flowergarden.factory.FlowerFactory;
import org.apache.log4j.Logger;

public class FlowerBuilder implements AbstractFlowerBuilder {
    final static Logger LOGGER = Logger.getLogger(FlowerBuilder.class);

    private Flower flower;
    private FlowerInitializer initializer;

    public FlowerBuilder() {
    }

    public FlowerBuilder(FlowerInitializer initializer) {
        this.initializer = initializer;
    }

    @Override
    public Flower buildFlower() {
        FlowerFactory flowerFactory = new FlowerFactory();
        String flowerType;
        if (initializer.getSellBy() > 0) {
            flowerType = "cut_flower";
        } else {
            flowerType = "pot_flower";
        }
        flower = flowerFactory.getFlower(flowerType);
        buildBasicFeatures();
        buildAdditionalFeatures();
        return flower;
    }


    public void buildBasicFeatures() {
        String name = initializer.getName();
        if (name != null) {
            flower.setName(name);
        } else {
            try {
                throw new ArgumentException("Name is null");
            } catch (ArgumentException e) {
                LOGGER.error(e);
            }
        }
        int price = initializer.getPrice();
        if (price > 0) {
            flower.setPrice(price);
        } else {
            try {
                throw new ArgumentException("Price is negative");
            } catch (ArgumentException e) {
                LOGGER.error(e);
            }
        }
        String flowersColor = initializer.getFlowersColor();
        if (flowersColor != null) {
            flower.setFlowersColor(flowersColor);
        } else {
            try {
                throw new ArgumentException("Flowers color is null");
            } catch (ArgumentException e) {
                LOGGER.error(e);
            }
        }
        String leavesColor = initializer.getLeavesColor();
        if (leavesColor != null) {
            flower.setLeavesColor(leavesColor);
        } else {
            try {
                throw new ArgumentException("Leaves color is null");
            } catch (ArgumentException e) {
                LOGGER.error(e);
            }
        }
        int stalkLength = initializer.getStalkLength();
        if (stalkLength > 0) {
            flower.setStalkLength(stalkLength);
        } else {
            try {
                throw new ArgumentException("Stalk Length is negative");
            } catch (ArgumentException e) {
                LOGGER.error(e);
            }
        }
        int freshnessLevel = initializer.getFreshnessLevel();
        if (freshnessLevel > 0) {
            flower.setFreshnessLevel(freshnessLevel);
        } else {
            try {
                throw new ArgumentException("Freshness level is negative");
            } catch (ArgumentException e) {
                LOGGER.error(e);
            }
        }
    }


    public void buildAdditionalFeatures() {
        PotFlower potFlower = null;
        CutFlower cutFlower = null;
        int sellBy = initializer.getSellBy();
        if (sellBy > 0) {
            cutFlower = (CutFlower) flower;
        } else {
            potFlower = (PotFlower) flower;
        }
        if (potFlower != null) {
            int temperature = initializer.getTemperature();
            if (temperature > 0) {
                potFlower.setTemperature(temperature);
            } else {
                try {
                    throw new ArgumentException("Temperature is negative");
                } catch (ArgumentException e) {
                    LOGGER.error(e);
                }
            }
            LightingLevel lighting = initializer.getLighting();
            if (lighting != null) {
                potFlower.setLighting(lighting);
            } else {
                try {
                    throw new ArgumentException("Lighting level is null");
                } catch (ArgumentException e) {
                    LOGGER.error(e);
                }
            }
            int watering = initializer.getWatering();
            if (watering > 0) {
                potFlower.setWatering(watering);
            } else {
                try {
                    throw new ArgumentException("Watering level is null");
                } catch (ArgumentException e) {
                    LOGGER.error(e);
                }
            }
        }
        if (cutFlower != null) {
            if (sellBy > 0) {
                cutFlower.setSellBy(sellBy);
            } else {
                try {
                    throw new ArgumentException("Sell by is negative");
                } catch (ArgumentException e) {
                    LOGGER.error(e);
                }
            }
        }
    }
}

