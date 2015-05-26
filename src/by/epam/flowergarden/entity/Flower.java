package by.epam.flowergarden.entity;

public abstract class Flower {
    private String name;
    private int price;
    private String leavesColor;
    private String flowersColor;
    private int stalkLength;
    private int freshnessLevel;

    public Flower() {
    }

    public Flower(String name, int price, String leavesColor, String flowersColor, int stalkLength, int freshnessLevel) {
        this.name = name;
        this.price = price;
        this.leavesColor = leavesColor;
        this.flowersColor = flowersColor;
        this.stalkLength = stalkLength;
        this.freshnessLevel = freshnessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeavesColor() {
        return leavesColor;
    }

    public void setLeavesColor(String leavesColor) {
        this.leavesColor = leavesColor;
    }

    public String getFlowersColor() {
        return flowersColor;
    }

    public void setFlowersColor(String flowersColor) {
        this.flowersColor = flowersColor;
    }

    public int getStalkLength() {
        return stalkLength;
    }

    public void setStalkLength(int stalkLength) {
        this.stalkLength = stalkLength;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    public void setFreshnessLevel(int freshnessLevel) {
        this.freshnessLevel = freshnessLevel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (price != flower.price) return false;
        if (stalkLength != flower.stalkLength) return false;
        if (freshnessLevel != flower.freshnessLevel) return false;
        if (name != null ? !name.equals(flower.name) : flower.name != null) return false;
        if (leavesColor != null ? !leavesColor.equals(flower.leavesColor) : flower.leavesColor != null) return false;
        return !(flowersColor != null ? !flowersColor.equals(flower.flowersColor) : flower.flowersColor != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (leavesColor != null ? leavesColor.hashCode() : 0);
        result = 31 * result + (flowersColor != null ? flowersColor.hashCode() : 0);
        result = 31 * result + stalkLength;
        result = 31 * result + freshnessLevel;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("name='").append(name).append("\'").append(", price=").append(price)
                .append(", leavesColor='").append(leavesColor).append("\'").append(", flowersColor='")
                .append(flowersColor).append("\'").append(", stalkLength=").append(stalkLength).append(", freshnessLevel=")
                .append(freshnessLevel).append(", ").toString();
    }
}
