package shop.trees.types;

import shop.Product;
import shop.decorations.balls.Ball;
import shop.decorations.lights.Light;
import shop.trees.AnChristmasTree;
import shop.trees.ChristmasTree;

import java.util.List;

import static shop.trees.types.Prices.NORWAY_SPRUCE_PRICE;
import static shop.trees.types.Prices.PLASTIC_PRICE;

public class Plastic extends AnChristmasTree implements ChristmasTree, Product {

    public Plastic(int height) {
        super(height, PLASTIC_PRICE);
    }

    public Plastic(int height, Light light) {
        super(height, light, PLASTIC_PRICE);
    }

    public Plastic(int height, List<Ball> balls) {
        super(height, balls, PLASTIC_PRICE);
    }

    public Plastic(int height, Light light, List<Ball> balls) {
        super(height, light, balls, PLASTIC_PRICE);
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
        return super.getPrice();
    }

    @Override
    public int getHeight() {
        return super.height;
    }
}
