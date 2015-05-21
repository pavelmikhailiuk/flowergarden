package by.epam.flowergarden.factory;


import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.entity.FlowerType;

public class FlowerFactory {
    public Flower getFlower(String flower){
        FlowerType flowerType=FlowerType.valueOf(flower.toUpperCase());
        return flowerType.getFlower();
    }
}
