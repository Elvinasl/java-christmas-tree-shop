package shop.trees.types;

import shop.Product;
import shop.decorations.lights.Light;
import shop.trees.AnChristmasTree;
import shop.trees.ChristmasTree;

public class NorwaySpruce extends AnChristmasTree implements ChristmasTree, Product {

    public NorwaySpruce(int height) {
        super(height);
    }

    public NorwaySpruce(int height, Light light) {
        super(height, light);
    }

    @Override
    public String getLightMessage() {
        return super.light.getMessage();
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
