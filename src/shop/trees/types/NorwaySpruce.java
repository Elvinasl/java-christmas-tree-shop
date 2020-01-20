package shop.trees.types;

import shop.Product;
import shop.decorations.balls.Ball;
import shop.decorations.lights.Light;
import shop.trees.AnChristmasTree;
import shop.trees.ChristmasTree;

import java.util.List;

import static shop.trees.types.Prices.NORWAY_SPRUCE_PRICE;

public class NorwaySpruce extends AnChristmasTree implements ChristmasTree, Product {

    public NorwaySpruce(int height) {
        super(height, NORWAY_SPRUCE_PRICE);
    }

    public NorwaySpruce(int height, Light light) {
        super(height, light, NORWAY_SPRUCE_PRICE);
    }

    public NorwaySpruce(int height, List<Ball> balls) {
        super(height, balls, NORWAY_SPRUCE_PRICE);
    }

    public NorwaySpruce(int height, Light light, List<Ball> balls) {
        super(height, light, balls, NORWAY_SPRUCE_PRICE);
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
        return super.getPrice();
    }

    @Override
    public int getHeight() {
        return super.height;
    }
}
