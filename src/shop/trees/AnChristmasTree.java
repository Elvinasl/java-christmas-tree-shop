package shop.trees;

import shop.decorations.balls.Ball;
import shop.decorations.lights.Light;

import java.util.List;

public abstract class AnChristmasTree {
    protected int height;
    protected Light light;
    private List<Ball> balls;
    private double price;

    public AnChristmasTree(int height, double price) {
        this.height = height;
        this.price = price;
    }

    public AnChristmasTree(int height, Light light, double price) {
        this.height = height;
        this.light = light;
        this.price = price;
    }

    public AnChristmasTree(int height, Light light, List<Ball> balls, double price) {
        this.height = height;
        this.light = light;
        this.balls = balls;
        this.price = price;
    }

    public AnChristmasTree(int height, List<Ball> balls, double price) {
        this.height = height;
        this.balls = balls;
        this.price = price;
    }

    public Light getLight() {
        return light;
    }

    public double getPrice() {
        double finalPrice = price;
        // lets add lights price (if we have lights)
        if (light != null) {
            finalPrice += light.getPrice();
        }

        // lets add balls price (if we have balls)
        if (balls != null && balls.size() > 0) {
            finalPrice += balls.stream().mapToDouble(Ball::getPrice).sum();
        }
        return finalPrice;
    }
}
