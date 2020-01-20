package shop.trees.types;

import shop.Product;
import shop.decorations.balls.Ball;
import shop.decorations.lights.Light;
import shop.trees.AnChristmasTree;
import shop.trees.ChristmasTree;

import java.util.List;

public class Plastic extends AnChristmasTree implements ChristmasTree, Product {

    public Plastic(int height) {
        super(height);
    }

    public Plastic(int height, Light light) {
        super(height, light);
    }

    public Plastic(int height, Light light, List<Ball> balls) {
        super(height, light, balls);
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
