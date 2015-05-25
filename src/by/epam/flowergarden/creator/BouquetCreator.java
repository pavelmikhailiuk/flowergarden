package by.epam.flowergarden.creator;


import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.exception.LogicalException;
import org.apache.log4j.Logger;

import static by.epam.flowergarden.entity.BouquetAccessories.*;
import static by.epam.flowergarden.entity.LightingLevel.MEDIUM;

public class BouquetCreator {
    final static Logger LOGGER = Logger.getLogger(FlowerCreator.class);

    public Bouquet create() {
        Bouquet bouquet = new Bouquet();
        try {
            FlowerCreator flowerCreator = new FlowerCreator(new FlowerInitializer("Rose", 35000, "green", "red", 80, 100, 5));
            bouquet.addFlower(flowerCreator.createFlower());
            flowerCreator = new FlowerCreator(new FlowerInitializer("Tulip", 15000, "lightgreen", "white", 50, 70, 4));
            bouquet.addFlower(flowerCreator.createFlower());
            flowerCreator = new FlowerCreator(new FlowerInitializer("Freesia", 10000, "darkgreen", "blue", 60, 90, 7));
            bouquet.addFlower(flowerCreator.createFlower());
            flowerCreator = new FlowerCreator(new FlowerInitializer("Orchid", 150000, "darkgreen", "violet", 75, 80, 20, MEDIUM, 300));
            bouquet.addFlower(flowerCreator.createFlower());
        } catch (LogicalException e) {
            LOGGER.error("Error building flowers", e);
        }
        bouquet.addAccessory(PACK);
        bouquet.addAccessory(BAND);
        bouquet.addAccessory(BUCKET);
        return bouquet;
    }
}
