package shop.trees.types;

import shop.Product;
import shop.trees.ChristmasTree;
import shop.trees.IChristmasTree;

public class NorwaySpruce extends ChristmasTree implements IChristmasTree, Product {

    public NorwaySpruce(int height) {
        super(height);
    }

    @Override
    public String getLabel() {
        return "Norway Spruce";
    }

    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public int getHeight() {
        return super.height;
    }
}
