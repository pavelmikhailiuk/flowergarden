package by.epam.flowergarden.entity;


public enum FlowerType {
    POT_FLOWER {
        @Override
        public Flower getFlower() {
            return new PotFlower();
        }
    }, CUT_FLOWER {
        @Override
        public Flower getFlower() {
            return new CutFlower();
        }
    };

    public abstract Flower getFlower();
}
