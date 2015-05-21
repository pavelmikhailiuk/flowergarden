package by.epam.flowergarden.builder;


import by.epam.flowergarden.entity.LightingLevel;
import org.apache.log4j.Logger;

public class FlowerInitializer {
    final static Logger LOGGER = Logger.getLogger(FlowerInitializer.class);

    private String name;
    private int price;
    private String leavesColor;
    private String flowersColor;
    private int stalkLength;
    private int freshnessLevel;
    private int temperature;
    private LightingLevel lighting;
    private int watering;
    private int sellBy;

    public FlowerInitializer(String name, int price, String leavesColor, String flowersColor, int stalkLength, int freshnessLevel, int temperature, LightingLevel lighting, int watering) {
        this.name = name;
        this.price = price;
        this.leavesColor = leavesColor;
        this.flowersColor = flowersColor;
        this.stalkLength = stalkLength;
        this.freshnessLevel = freshnessLevel;
        this.temperature = temperature;
        this.lighting = lighting;
        this.watering = watering;
    }

    public FlowerInitializer(String name, int price, String leavesColor, String flowersColor, int stalkLength, int freshnessLevel, int sellBy) {
        this.name = name;
        this.price = price;
        this.leavesColor = leavesColor;
        this.flowersColor = flowersColor;
        this.stalkLength = stalkLength;
        this.freshnessLevel = freshnessLevel;
        this.sellBy = sellBy;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getLeavesColor() {
        return leavesColor;
    }

    public String getFlowersColor() {
        return flowersColor;
    }

    public int getStalkLength() {
        return stalkLength;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    public int getTemperature() {
        return temperature;
    }

    public LightingLevel getLighting() {
        return lighting;
    }

    public int getWatering() {
        return watering;
    }

    public int getSellBy() {
        return sellBy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLeavesColor(String leavesColor) {
        this.leavesColor = leavesColor;
    }

    public void setFlowersColor(String flowersColor) {
        this.flowersColor = flowersColor;
    }

    public void setStalkLength(int stalkLength) {
        this.stalkLength = stalkLength;
    }

    public void setFreshnessLevel(int freshnessLevel) {
        this.freshnessLevel = freshnessLevel;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setLighting(LightingLevel lighting) {
        this.lighting = lighting;
    }

    public void setWatering(int watering) {
        this.watering = watering;
    }

    public void setSellBy(int sellBy) {
        this.sellBy = sellBy;
    }
}
