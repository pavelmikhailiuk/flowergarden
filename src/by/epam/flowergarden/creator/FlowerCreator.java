package by.epam.flowergarden.creator;


import by.epam.flowergarden.creator.FlowerInitializer;
import by.epam.flowergarden.entity.CutFlower;
import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.entity.LightingLevel;
import by.epam.flowergarden.entity.PotFlower;
import by.epam.flowergarden.exception.LogicalException;

public class FlowerCreator {

    private Flower flower;
    private FlowerInitializer initializer;

    public FlowerCreator() {
    }

    public FlowerCreator(FlowerInitializer initializer) {
        this.initializer = initializer;
    }

    public Flower createFlower() throws LogicalException {
        if (initializer.getSellBy() > 0) {
            flower = new CutFlower();
        } else {
            flower = new PotFlower();
        }
        createBasicFeatures();
        createAdditionalFeatures();
        return flower;
    }


    public void createBasicFeatures() throws LogicalException {
        String name = initializer.getName();
        if (name != null) {
            flower.setName(name);
        } else {
            throw new LogicalException("Name is null");
        }
        int price = initializer.getPrice();
        if (price > 0) {
            flower.setPrice(price);
        } else {
            throw new LogicalException("Price is negative");
        }
        String flowersColor = initializer.getFlowersColor();
        if (flowersColor != null) {
            flower.setFlowersColor(flowersColor);
        } else {
            throw new LogicalException("Flowers color is null");
        }
        String leavesColor = initializer.getLeavesColor();
        if (leavesColor != null) {
            flower.setLeavesColor(leavesColor);
        } else {
            throw new LogicalException("Leaves color is null");
        }
        int stalkLength = initializer.getStalkLength();
        if (stalkLength > 0) {
            flower.setStalkLength(stalkLength);
        } else {
            throw new LogicalException("Stalk Length is negative");
        }
        int freshnessLevel = initializer.getFreshnessLevel();
        if (freshnessLevel > 0) {
            flower.setFreshnessLevel(freshnessLevel);
        } else {
            throw new LogicalException("Freshness level is negative");
        }
    }


    public void createAdditionalFeatures() throws LogicalException {
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
                throw new LogicalException("Temperature is negative");
            }
            LightingLevel lighting = initializer.getLighting();
            if (lighting != null) {
                potFlower.setLighting(lighting);
            } else {
                throw new LogicalException("Lighting level is null");
            }
            int watering = initializer.getWatering();
            if (watering > 0) {
                potFlower.setWatering(watering);
            } else {
                throw new LogicalException("Watering level is null");
            }
        }
        if (cutFlower != null) {
            if (sellBy > 0) {
                cutFlower.setSellBy(sellBy);
            } else {
                throw new LogicalException("Sell by is negative");
            }
        }
    }
}

