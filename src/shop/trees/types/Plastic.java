package shop.trees.types;

import shop.Product;
import shop.decorations.lights.Light;
import shop.trees.ChristmasTree;
import shop.trees.IChristmasTree;

public class Plastic extends ChristmasTree implements IChristmasTree, Product {

    public Plastic(int height) {
        super(height);
    }

    public Plastic(int height, Light light) {
        super(height, light);
    }

    @Override
    public String getLightMessage() {
        return super.light.getMessage();
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
