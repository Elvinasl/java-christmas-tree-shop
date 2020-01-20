package shop.trees.types;

import shop.Product;
import shop.trees.ChristmasTree;
import shop.trees.IChristmasTree;

public class NordMann extends ChristmasTree implements IChristmasTree, Product {

    public NordMann(int height) {
        super(height);
    }

    @Override
    public String getLabel() {
        return "Nordmann";
    }

    @Override
    public double getPrice() {
        return 30;
    }

    @Override
    public int getHeight() {
        return super.height;
    }
}
