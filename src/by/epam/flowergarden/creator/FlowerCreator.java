package by.epam.flowergarden.creator;


import by.epam.flowergarden.entity.CutFlower;
import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.entity.LightingLevel;
import by.epam.flowergarden.entity.PotFlower;
import by.epam.flowergarden.exception.LogicalException;

import static by.epam.flowergarden.constant.Constants.*;

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
            throw new LogicalException(NAME_IS_NULL);
        }
        int price = initializer.getPrice();
        if (price > 0) {
            flower.setPrice(price);
        } else {
            throw new LogicalException(PRICE_IS_NEGATIVE);
        }
        String flowersColor = initializer.getFlowersColor();
        if (flowersColor != null) {
            flower.setFlowersColor(flowersColor);
        } else {
            throw new LogicalException(FLOWERS_COLOR_IS_NULL);
        }
        String leavesColor = initializer.getLeavesColor();
        if (leavesColor != null) {
            flower.setLeavesColor(leavesColor);
        } else {
            throw new LogicalException(LEAVES_COLOR_IS_NULL);
        }
        int stalkLength = initializer.getStalkLength();
        if (stalkLength > 0) {
            flower.setStalkLength(stalkLength);
        } else {
            throw new LogicalException(STALK_LENGTH_IS_NEGATIVE);
        }
        int freshnessLevel = initializer.getFreshnessLevel();
        if (freshnessLevel > 0) {
            flower.setFreshnessLevel(freshnessLevel);
        } else {
            throw new LogicalException(FRESHNESS_LEVEL_IS_NEGATIVE);
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
                throw new LogicalException(TEMPERATURE_IS_NEGATIVE);
            }
            LightingLevel lighting = initializer.getLighting();
            if (lighting != null) {
                potFlower.setLighting(lighting);
            } else {
                throw new LogicalException(LIGHTING_LEVEL_IS_NULL);
            }
            int watering = initializer.getWatering();
            if (watering > 0) {
                potFlower.setWatering(watering);
            } else {
                throw new LogicalException(WATERING_LEVEL_IS_NULL);
            }
        }
        if (cutFlower != null) {
            if (sellBy > 0) {
                cutFlower.setSellBy(sellBy);
            } else {
                throw new LogicalException(SELL_BY_IS_NEGATIVE);
            }
        }
    }
}

