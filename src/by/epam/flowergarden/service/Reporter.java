package by.epam.flowergarden.service;


import by.epam.flowergarden.entity.Bouquet;
import by.epam.flowergarden.entity.BouquetAccessories;
import by.epam.flowergarden.entity.Flower;
import by.epam.flowergarden.exception.TechnicalException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Reporter {

    public void print(Bouquet bouquet) throws TechnicalException {
        List<Flower> flowersList = bouquet.getFlowerList();
        List<BouquetAccessories> bouquetAccessoriesList = bouquet.getAccessories();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("report/report.txt", true);
            fileWriter.write(flowersList.toString() + "\n");
            fileWriter.write(bouquetAccessoriesList.toString() + "\n");
        } catch (IOException e) {
            throw new TechnicalException("Report file I/O error", e);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new TechnicalException("Report file I/O error", e);
                }
            }
        }
    }

    public void print(List<Flower> flowersList) throws TechnicalException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("report/report.txt", true);
            fileWriter.write(flowersList.toString() + "\n");
        } catch (IOException e) {
            throw new TechnicalException("Report file I/O error", e);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new TechnicalException("Report file I/O error", e);
                }
            }
        }
    }

    public void print(String info) throws TechnicalException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("report/report.txt", true);
            fileWriter.write(info + "\n");
        } catch (IOException e) {
            throw new TechnicalException("Report file I/O error", e);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new TechnicalException("Report file I/O error", e);
                }
            }
        }
    }
}
