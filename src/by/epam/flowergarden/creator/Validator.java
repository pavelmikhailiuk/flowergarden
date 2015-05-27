package by.epam.flowergarden.creator;


import by.epam.flowergarden.entity.LightingLevel;
import by.epam.flowergarden.exception.LogicalException;

import static by.epam.flowergarden.constant.Constants.*;

public class Validator {

    public boolean validate(String name, int price, String leavesColor, String flowersColor, int stalkLength, int freshnessLevel) throws LogicalException {
        boolean isValid = false;
        if (name != null && price > 0 && leavesColor != null && flowersColor != null && stalkLength > 0 && freshnessLevel > 0) {
            isValid = true;
        } else {
            throw new LogicalException(BASIC_PARAMETERS_ARE_NOT_VALID);
        }
        return isValid;
    }

    public boolean validate(int temperature, LightingLevel lightingLevel, int watering) throws LogicalException {
        boolean isValid = false;
        if (temperature > 0 && lightingLevel != null && watering > 0) {
            isValid = true;
        } else {
            throw new LogicalException(POT_FLOWER_ADDITIONAL_PARAMETERS_ARE_NOT_VALID);
        }
        return isValid;
    }

    public boolean validate(int sellBy) throws LogicalException {
        boolean isValid = false;
        if (sellBy > 0) {
            isValid = true;
        } else {
            throw new LogicalException(CUT_FLOWER_ADDITIONAL_PARAMETER_ARE_NOT_VALID);
        }
        return isValid;
    }


}
