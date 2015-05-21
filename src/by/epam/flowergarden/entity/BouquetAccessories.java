package by.epam.flowergarden.entity;


public enum BouquetAccessories {
    PACK(3000), BAND(1000), BUCKET(10000);
    private int price;

    BouquetAccessories(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
