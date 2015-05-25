package by.epam.flowergarden.creator;


import by.epam.flowergarden.entity.LightingLevel;

public class FlowerInitializer {

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


}
