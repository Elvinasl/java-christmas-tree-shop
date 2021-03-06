package shop.trees.types;

import shop.Product;
import shop.decorations.balls.Ball;
import shop.decorations.lights.Light;
import shop.trees.AnChristmasTree;
import shop.trees.ChristmasTree;

import java.util.List;

public class NordMann extends AnChristmasTree implements ChristmasTree, Product {

    public NordMann(int height) {
        super(height, Prices.NORDMANN_PRICE);
    }

    public NordMann(int height, Light light) {
        super(height, light, Prices.NORDMANN_PRICE);
    }

    public NordMann(int height, List<Ball> balls) {
        super(height, balls, Prices.NORDMANN_PRICE);
    }

    public NordMann(int height, Light light, List<Ball> balls) {
        super(height, light, balls, Prices.NORDMANN_PRICE);
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
        return super.getPrice();
    }

    @Override
    public int getHeight() {
        return super.height;
    }
}
