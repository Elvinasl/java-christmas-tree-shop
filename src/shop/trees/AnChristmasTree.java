package shop.trees;

import shop.decorations.balls.Ball;
import shop.decorations.lights.Light;

import java.util.List;

public abstract class AnChristmasTree {
    protected int height;
    protected Light light;
    protected List<Ball> balls;

    public AnChristmasTree(int height) {
        this.height = height;
    }

    public AnChristmasTree(int height, Light light) {
        this.height = height;
        this.light = light;
    }

    public AnChristmasTree(int height, Light light, List<Ball> balls) {
        this.height = height;
        this.light = light;
        this.balls = balls;
    }
}
