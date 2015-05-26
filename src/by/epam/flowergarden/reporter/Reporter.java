package by.epam.flowergarden.reporter;


import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.entity.BouquetAccessories;
import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.exception.TechnicalException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static by.epam.flowergarden.constant.Constants.REPORT_FILE_IO_ERROR;
import static by.epam.flowergarden.constant.Constants.REPORT_FILE_NAME;

public class Reporter {

    public boolean report(Bouquet bouquet) throws TechnicalException {
        List<Flower> flowersList = bouquet.getFlowerList();
        List<BouquetAccessories> bouquetAccessoriesList = bouquet.getAccessories();
        boolean isPrinted = false;
        try (FileWriter fileWriter = new FileWriter(REPORT_FILE_NAME, true)) {
            fileWriter.write(flowersList.toString() + "\n");
            fileWriter.write(bouquetAccessoriesList.toString() + "\n");
            isPrinted = true;
        } catch (IOException e) {
            throw new TechnicalException(REPORT_FILE_IO_ERROR, e);
        }
        return isPrinted;
    }

    public boolean report(List<Flower> flowersList) throws TechnicalException {
        boolean isPrinted = false;
        try (FileWriter fileWriter = new FileWriter(REPORT_FILE_NAME, true)) {
            fileWriter.write(flowersList.toString() + "\n");
            isPrinted = true;
        } catch (IOException e) {
            throw new TechnicalException(REPORT_FILE_IO_ERROR, e);
        }
        return isPrinted;
    }

    public boolean report(String info) throws TechnicalException {
        boolean isPrinted = false;
        try (FileWriter fileWriter = new FileWriter(REPORT_FILE_NAME, true)) {
            fileWriter.write(info + "\n");
            isPrinted = true;
        } catch (IOException e) {
            throw new TechnicalException(REPORT_FILE_IO_ERROR, e);
        }
        return isPrinted;
    }
}
