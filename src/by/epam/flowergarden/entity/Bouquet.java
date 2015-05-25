package by.epam.flowergarden.entity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bouquet {
    private List<Flower> flowerList;
    private List<BouquetAccessories> accessories;

    public Bouquet() {
        flowerList = new ArrayList<Flower>();
        accessories = new ArrayList<BouquetAccessories>();
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public List<BouquetAccessories> getAccessories() {
        return Collections.unmodifiableList(accessories);
    }

    public void addFlower(Flower flower) {
        flowerList.add(flower);
    }

    public void addAccessory(BouquetAccessories bouquetAccessory) {
        accessories.add(bouquetAccessory);
    }

    public boolean remove(Flower flower) {
        return flowerList.remove(flower);
    }

    public boolean remove(BouquetAccessories bouquetAccessories) {
        return accessories.remove(bouquetAccessories);
    }
}
