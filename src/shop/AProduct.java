package shop;

public abstract class AProduct implements Product {
    private String label;
    private double price;

    public AProduct(String label, double price) {
        this.label = label;
        this.price = price;
    }
}
