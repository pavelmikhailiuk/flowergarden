package by.epam.flowergarden.service;


import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.entity.BouquetAccessories;
import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.exception.TechnicalException;
import org.apache.log4j.Logger;

import java.util.List;

public class PriceCalculator {
    final static Logger LOGGER = Logger.getLogger(PriceCalculator.class);

    public void calculate(Bouquet bouquet) {
        Reporter reporter = new Reporter();
        List<Flower> flowersList = bouquet.getFlowerList();
        List<BouquetAccessories> bouquetAccessoriesList = bouquet.getAccessories();
        int bouquetPrice = 0;
        for (Flower flower : flowersList) {
            bouquetPrice += flower.getPrice();
        }
        for (BouquetAccessories accessory : bouquetAccessoriesList) {
            bouquetPrice += accessory.getPrice();
        }
        try {
            reporter.print("Bouquet price is: " + bouquetPrice);
        } catch (TechnicalException e) {
            LOGGER.error(e);
        }
    }
}
