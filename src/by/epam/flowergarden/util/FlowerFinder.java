package by.epam.flowergarden.util;


import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.entity.Flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerFinder {

    public ArrayList<Flower> findStalkLength(Bouquet bouquet, int minStalkLength, int maxStalkLength) {
        List<Flower> flowersList = bouquet.getFlowerList();
        ArrayList<Flower> foundFlowers = new ArrayList<>();
        for (Flower flower : flowersList) {
            int stalkLength = flower.getStalkLength();
            if ((stalkLength >= minStalkLength) && (stalkLength <= maxStalkLength)) {
                foundFlowers.add(flower);
            }
        }
        return foundFlowers;
    }
}
