package by.epam.flowergarden.creator;


import by.epam.flowergarden.entity.Bouquet;

import static by.epam.flowergarden.entity.BouquetAccessories.*;
import static by.epam.flowergarden.entity.LightingLevel.MEDIUM;

public class BouquetCreator {
    public Bouquet create() {
        Bouquet bouquet = new Bouquet();
        FlowerCreator flowerCreator = new FlowerCreator(new Validator());
        bouquet.addFlower(flowerCreator.createFlower("Rose", 35000, "green", "red", 80, 100, 5));
        bouquet.addFlower(flowerCreator.createFlower("Tulip", 15000, "lightgreen", "white", 50, 70, 4));
        bouquet.addFlower(flowerCreator.createFlower("Freesia", 10000, "darkgreen", "blue", 60, 90, 7));
        bouquet.addFlower(flowerCreator.createFlower("Orchid", 150000, "darkgreen", "violet", 75, 80, 20, MEDIUM, 300));
        bouquet.addAccessory(PACK);
        bouquet.addAccessory(BAND);
        bouquet.addAccessory(BUCKET);
        return bouquet;
    }
}
