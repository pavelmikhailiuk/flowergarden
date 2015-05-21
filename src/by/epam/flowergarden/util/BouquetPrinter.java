package by.epam.flowergarden.util;


import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.entity.BouquetAccessories;
import by.epam.flowergarden.entity.Flower;
import org.apache.log4j.Logger;

import java.util.List;

public class BouquetPrinter {
    final static Logger LOGGER = Logger.getLogger(BouquetPrinter.class);

    public void print(Bouquet bouquet) {
        List<Flower> flowersList = bouquet.getFlowerList();
        List<BouquetAccessories> bouquetAccessoriesList = bouquet.getAccessories();
        for (Flower flower : flowersList) {
            LOGGER.info(flower);
        }
        for (BouquetAccessories accessory : bouquetAccessoriesList) {
            LOGGER.info(accessory);
        }
    }

    public void print(List<Flower> flowersList) {
        for (Flower flower : flowersList) {
            LOGGER.info(flower);
        }
    }

    public void print(Flower flower) {
        LOGGER.info(flower);
    }
}
