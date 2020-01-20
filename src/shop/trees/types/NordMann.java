package shop.trees.types;

import shop.Product;
import shop.decorations.balls.Ball;
import shop.decorations.lights.Light;
import shop.trees.AnChristmasTree;
import shop.trees.ChristmasTree;

import java.util.List;

public class NordMann extends AnChristmasTree implements ChristmasTree, Product {

    public NordMann(int height) {
        super(height);
    }

    public NordMann(int height, Light light) {
        super(height, light);
    }

    public NordMann(int height, Light light, List<Ball> balls) {
        super(height, light, balls);
    }

    @Override
    public String getLabel() {
        return "Nordmann";
    }

    @Override
    public String getLightMessage() {
        return super.light.getMessage();
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
