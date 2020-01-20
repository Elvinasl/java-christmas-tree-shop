package shop.trees;

import shop.decorations.lights.Light;

public abstract class ChristmasTree {
    protected int height;
    protected Light light;

    public ChristmasTree(int height) {
        this.height = height;
    }

    public ChristmasTree(int height, Light light) {
        this.height = height;
        this.light = light;
    }
}
