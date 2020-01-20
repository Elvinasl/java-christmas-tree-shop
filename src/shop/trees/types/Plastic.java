package shop.trees.types;

import shop.Product;
import shop.trees.ChristmasTree;
import shop.trees.IChristmasTree;

public class Plastic extends ChristmasTree implements IChristmasTree, Product {

    public Plastic(int height) {
        super(height);
    }

    @Override
    public String getLabel() {
        return "Fake (plastic)";
    }

    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public int getHeight() {
        return super.height;
    }
}
