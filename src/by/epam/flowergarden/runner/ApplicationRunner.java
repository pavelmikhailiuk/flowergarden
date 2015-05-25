package by.epam.flowergarden.runner;


import by.epam.flowergarden.creator.BouquetCreator;
import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.exception.TechnicalException;
import by.epam.flowergarden.service.FlowerFinder;
import by.epam.flowergarden.service.FlowerSorter;
import by.epam.flowergarden.service.PriceCalculator;
import by.epam.flowergarden.service.Reporter;
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
        Reporter reporter = new Reporter();
        try {
            reporter.print(bouquet);
        } catch (TechnicalException e) {
            LOGGER.error(e);
        }
        FlowerSorter flowerSorter = new FlowerSorter();
        flowerSorter.sortByFreshness(bouquet);
        try {
            reporter.print(bouquet);
        } catch (TechnicalException e) {
            LOGGER.error(e);
        }
        FlowerFinder flowerFinder = new FlowerFinder();
        List<Flower> foundFlowers = flowerFinder.findStalkLength(bouquet, 70, 80);
        try {
            reporter.print(foundFlowers);
        } catch (TechnicalException e) {
            LOGGER.error(e);
        }
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.calculate(bouquet);
    }
}
