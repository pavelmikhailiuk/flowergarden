package by.epam.flowergarden.service;


import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.entity.BouquetAccessories;
import by.epam.flowergarden.entity.Flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FlowerService {
    public List<Flower> findStalkLength(Bouquet bouquet, int minStalkLength, int maxStalkLength) {
        List<Flower> flowersList = bouquet.getFlowerList();
        List<Flower> foundFlowers = new ArrayList<>();
        for (Flower flower : flowersList) {
            int stalkLength = flower.getStalkLength();
            if ((stalkLength >= minStalkLength) && (stalkLength <= maxStalkLength)) {
                foundFlowers.add(flower);
            }
        }
        return foundFlowers;
    }

    public List<Flower> sortByFreshness(Bouquet bouquet) {
        List<Flower> flowersList = bouquet.getFlowerList();
        List<Flower> copyFlowerList = new ArrayList<>(flowersList);
        Collections.sort(copyFlowerList, new Comparator<Flower>() {
            @Override
            public int compare(Flower flower1, Flower flower2) {
                return flower1.getFreshnessLevel() - flower2.getFreshnessLevel();
            }
        });
        return copyFlowerList;
    }

    public int calculate(Bouquet bouquet) {
        List<Flower> flowersList = bouquet.getFlowerList();
        List<BouquetAccessories> bouquetAccessoriesList = bouquet.getAccessories();
        int bouquetPrice = 0;
        for (Flower flower : flowersList) {
            bouquetPrice += flower.getPrice();
        }
        for (BouquetAccessories accessory : bouquetAccessoriesList) {
            bouquetPrice += accessory.getPrice();
        }
        return bouquetPrice;
    }
}
