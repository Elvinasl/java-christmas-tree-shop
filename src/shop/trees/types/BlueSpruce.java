package shop.trees.types;

import shop.Product;
import shop.trees.ChristmasTree;
import shop.trees.IChristmasTree;

public class BlueSpruce extends ChristmasTree implements IChristmasTree, Product {

    public BlueSpruce(int height) {
        super(height);
    }

    @Override
    public int getHeight() {
        return super.height;
    }

    @Override
    public String getLabel() {
        return "Blue Spruce";
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
