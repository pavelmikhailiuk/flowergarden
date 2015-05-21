package by.epam.flowergarden.creator;


import by.epam.flowergarden.builder.AbstractFlowerBuilder;
import by.epam.flowergarden.builder.FlowerBuilder;
import by.epam.flowergarden.builder.FlowerInitializer;
import by.epam.flowergarden.entity.Bouquet;

import static by.epam.flowergarden.entity.BouquetAccessories.*;
import static by.epam.flowergarden.entity.LightingLevel.MEDIUM;

public class BouquetCreator {
    public Bouquet create() {
        Bouquet bouquet = new Bouquet();
        AbstractFlowerBuilder flowerBuilder = new FlowerBuilder(new FlowerInitializer("Rose", 35000, "green", "red", 80, 100, 5));
        bouquet.addFlower(flowerBuilder.buildFlower());
        flowerBuilder = new FlowerBuilder(new FlowerInitializer("Tulip", 15000, "lightgreen", "white", 50, 70, 4));
        bouquet.addFlower(flowerBuilder.buildFlower());
        flowerBuilder = new FlowerBuilder(new FlowerInitializer("Freesia", 10000, "darkgreen", "blue", 60, 90, 7));
        bouquet.addFlower(flowerBuilder.buildFlower());
        flowerBuilder = new FlowerBuilder(new FlowerInitializer("Orchid", 150000, "darkgreen", "violet", 75, 80, 20, MEDIUM, 300));
        bouquet.addFlower(flowerBuilder.buildFlower());
        bouquet.addAccessory(PACK);
        bouquet.addAccessory(BAND);
        bouquet.addAccessory(BUCKET);
        return bouquet;
    }
}
