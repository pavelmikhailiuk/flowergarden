package by.epam.flowergarden.runner;


import by.epam.flowergarden.creator.BouquetCreator;
import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.util.BouquetPrinter;
import by.epam.flowergarden.util.FlowerFinder;
import by.epam.flowergarden.util.FlowerSorter;
import by.epam.flowergarden.util.PriceCalculator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.List;


public class ApplicationRunner {
    final static Logger LOGGER = Logger.getLogger(ApplicationRunner.class);

    static {
        PropertyConfigurator.configure("config/log4j.properties");
    }

    public static void main(String[] args) {
        BouquetCreator bouquetCreator = new BouquetCreator();
        Bouquet bouquet = bouquetCreator.create();
        BouquetPrinter bouquetPrinter = new BouquetPrinter();
        bouquetPrinter.print(bouquet);
        FlowerSorter flowerSorter=new FlowerSorter();
        flowerSorter.sortByFreshness(bouquet);
        bouquetPrinter.print(bouquet);
        FlowerFinder flowerFinder=new FlowerFinder();
        List<Flower> foundFlowers=flowerFinder.findStalkLength(bouquet, 70, 80);
        bouquetPrinter.print(foundFlowers);
        PriceCalculator priceCalculator=new PriceCalculator();
        priceCalculator.calculate(bouquet);
    }
}
