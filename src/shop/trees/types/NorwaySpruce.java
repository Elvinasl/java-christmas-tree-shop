package shop.trees.types;

import shop.Product;
import shop.decorations.balls.Ball;
import shop.decorations.lights.Light;
import shop.trees.AnChristmasTree;
import shop.trees.ChristmasTree;

import java.util.List;

public class NorwaySpruce extends AnChristmasTree implements ChristmasTree, Product {

    public NorwaySpruce(int height) {
        super(height);
    }

    public NorwaySpruce(int height, Light light) {
        super(height, light);
    }

    public NorwaySpruce(int height, Light light, List<Ball> balls) {
        super(height, light, balls);
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
