package shop.trees.types;

import shop.Product;
import shop.decorations.lights.Light;
import shop.trees.ChristmasTree;
import shop.trees.IChristmasTree;

public class NordMann extends ChristmasTree implements IChristmasTree, Product {

    public NordMann(int height) {
        super(height);
    }

    public NordMann(int height, Light light) {
        super(height, light);
    }

    @Override
    public String getLabel() {
        return "Nordmann";
    }

    @Override
    public Light getLight() {
        return super.light;
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
