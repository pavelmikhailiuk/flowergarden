package by.epam.flowergarden.creator;


import by.epam.flowergarden.entity.CutFlower;
import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.entity.LightingLevel;
import by.epam.flowergarden.entity.PotFlower;
import by.epam.flowergarden.exception.LogicalException;
import org.apache.log4j.Logger;

import static by.epam.flowergarden.constant.Constants.ERROR_BUILDING_FLOWER;

public class FlowerCreator {
    final static Logger LOGGER = Logger.getLogger(FlowerCreator.class);
    private Validator validator;

    public FlowerCreator(Validator validator) {
        this.validator = validator;
    }

    public Flower createFlower(String name, int price, String leavesColor, String flowersColor, int stalkLength, int freshnessLevel, int temperature, LightingLevel lightingLevel, int watering) {
        Flower flower = null;
        try {
            if (validator.validate(name, price, leavesColor, flowersColor, stalkLength, freshnessLevel) && validator.validate(temperature, lightingLevel, watering)) {
                flower = new PotFlower(name, price, leavesColor, flowersColor, stalkLength, freshnessLevel, temperature, lightingLevel, watering);
            }
        } catch (LogicalException e) {
            LOGGER.error(ERROR_BUILDING_FLOWER, e);
        }
        return flower;
    }

    public Flower createFlower(String name, int price, String leavesColor, String flowersColor, int stalkLength, int freshnessLevel, int sellBy) {
        Flower flower = null;
        try {
            if (validator.validate(name, price, leavesColor, flowersColor, stalkLength, freshnessLevel) && validator.validate(sellBy)) {
                flower = new CutFlower(name, price, leavesColor, flowersColor, stalkLength, freshnessLevel, sellBy);
            }
        } catch (LogicalException e) {
            LOGGER.error(ERROR_BUILDING_FLOWER, e);
        }
        return flower;
    }


}

