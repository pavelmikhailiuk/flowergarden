package by.epam.flowergarden.entity;


public class CutFlower extends Flower {
    private int sellBy;

    public CutFlower() {
    }

    public CutFlower(String name, int price, String leavesColor, String flowersColor, int stalkLength, int freshnessLevel, int sellBy) {
        super(name, price, leavesColor, flowersColor, stalkLength, freshnessLevel);
        this.sellBy = sellBy;
    }

    public int getSellBy() {
        return sellBy;
    }

    public void setSellBy(int sellBy) {
        this.sellBy = sellBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CutFlower that = (CutFlower) o;

        return sellBy == that.sellBy;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + sellBy;
        return result;
    }

    @Override
    public String toString() {
        return "CuttedFlower{" + super.toString() +
                "sellBy=" + sellBy +
                '}';
    }
}
