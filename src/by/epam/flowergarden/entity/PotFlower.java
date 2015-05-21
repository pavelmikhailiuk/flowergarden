package by.epam.flowergarden.entity;


public class PotFlower extends Flower {
    private int temperature;
    private LightingLevel lighting;
    private int watering;

    public PotFlower() {
    }

    public PotFlower(String name, int price, String leavesColor, String flowersColor, int stalkLength, int freshnessLevel, int temperature, LightingLevel lighting, int watering) {
        super(name, price, leavesColor, flowersColor, stalkLength, freshnessLevel);
        this.temperature = temperature;
        this.lighting = lighting;
        this.watering = watering;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public LightingLevel getLighting() {
        return lighting;
    }

    public void setLighting(LightingLevel lighting) {
        this.lighting = lighting;
    }

    public int getWatering() {
        return watering;
    }

    public void setWatering(int watering) {
        this.watering = watering;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PotFlower potFlower = (PotFlower) o;

        if (temperature != potFlower.temperature) return false;
        if (watering != potFlower.watering) return false;
        return lighting == potFlower.lighting;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + temperature;
        result = 31 * result + (lighting != null ? lighting.hashCode() : 0);
        result = 31 * result + watering;
        return result;
    }

    @Override
    public String toString() {
        return "PotFlower{" + super.toString() +
                "temperature=" + temperature +
                ", lighting=" + lighting +
                ", watering=" + watering +
                '}';
    }
}
