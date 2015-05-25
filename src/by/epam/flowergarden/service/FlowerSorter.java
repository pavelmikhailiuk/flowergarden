package by.epam.flowergarden.service;


import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.entity.Flower;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FlowerSorter {
    public Bouquet sortByFreshness(Bouquet bouquet) {
        List<Flower> flowersList = bouquet.getFlowerList();
        Collections.sort(flowersList, new Comparator<Flower>() {
            @Override
            public int compare(Flower flower1, Flower flower2) {
                return flower1.getFreshnessLevel() - flower2.getFreshnessLevel();
            }
        });
        return bouquet;
    }
}
