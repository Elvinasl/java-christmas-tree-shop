package shop.trees.types;

import shop.Product;
import shop.decorations.balls.Ball;
import shop.decorations.lights.Light;
import shop.trees.AnChristmasTree;
import shop.trees.ChristmasTree;

import java.util.List;

public class BlueSpruce extends AnChristmasTree implements ChristmasTree, Product {

    public BlueSpruce(int height) {
        super(height, Prices.BLUE_SPRUCE_PRICE);
    }

    public BlueSpruce(int height, List<Ball> balls) {
        super(height, balls, Prices.BLUE_SPRUCE_PRICE);
    }

    public BlueSpruce(int height, Light light) {
        super(height, light, Prices.BLUE_SPRUCE_PRICE);
    }

    public BlueSpruce(int height, Light light, List<Ball> balls) {
        super(height, light, balls, Prices.BLUE_SPRUCE_PRICE);
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
        return super.getPrice();
    }

}
