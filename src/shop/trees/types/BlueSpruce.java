package shop.trees.types;

import shop.Product;
import shop.decorations.lights.Light;
import shop.trees.ChristmasTree;
import shop.trees.IChristmasTree;

public class BlueSpruce extends ChristmasTree implements IChristmasTree, Product {

    public BlueSpruce(int height) {
        super(height);
    }

    public BlueSpruce(int height, Light light) {
        super(height, light);
    }

    @Override
    public String getLightMessage() {
        return super.light.getMessage();
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
