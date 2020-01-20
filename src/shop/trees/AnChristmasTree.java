package shop.trees;

import shop.decorations.lights.Light;

public abstract class AnChristmasTree {
    protected int height;
    protected Light light;

    public AnChristmasTree(int height) {
        this.height = height;
    }

    public AnChristmasTree(int height, Light light) {
        this.height = height;
        this.light = light;
    }
}
