package by.epam.flowergarden.runner;


import by.epam.flowergarden.creator.BouquetCreator;
import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.exception.TechnicalException;
import by.epam.flowergarden.reporter.Reporter;
import by.epam.flowergarden.service.FlowerService;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.List;

import static by.epam.flowergarden.constant.Constants.MAX_STALK_LENGTH;
import static by.epam.flowergarden.constant.Constants.MIN_STALK_LENGTH;


public class ApplicationRunner {
    final static Logger LOGGER = Logger.getLogger(ApplicationRunner.class);

    static {
        PropertyConfigurator.configure("config/log4j.properties");
    }

    public static void main(String[] args) {
        BouquetCreator bouquetCreator = new BouquetCreator();
        Bouquet bouquet = bouquetCreator.create();
        Reporter reporter = new Reporter();
        FlowerService flowerService = new FlowerService();
        List<Flower> sortedFlowers = flowerService.sortByFreshness(bouquet);
        List<Flower> foundFlowers = flowerService.findStalkLength(bouquet, MIN_STALK_LENGTH, MAX_STALK_LENGTH);
        int bouquetPrice = flowerService.calculate(bouquet);
        try {
            boolean isPrinted = reporter.report(bouquet);
            LOGGER.info(isPrinted);
            isPrinted = reporter.report(sortedFlowers);
            LOGGER.info(isPrinted);
            isPrinted = reporter.report(foundFlowers);
            LOGGER.info(isPrinted);
            isPrinted = reporter.report("Bouquet price is: " + bouquetPrice);
            LOGGER.info(isPrinted);
        } catch (TechnicalException e) {
            LOGGER.error(e);
        }
    }
}
