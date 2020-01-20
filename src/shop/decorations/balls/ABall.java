package shop.decorations.balls;

import shop.exceptions.ChristmasBallTooBigException;

public abstract class ABall {
    protected int diameter;
    protected Color color;
    public enum Color {
        BLUE,
        RED,
        GOLD,
        WHITE
    }

    public ABall(int diameter, Color color) throws ChristmasBallTooBigException {
        if (diameter > 30) {
            throw new ChristmasBallTooBigException("Ball is too big!");
        } else {
            this.diameter = diameter;
            this.color = color;
        }
    }
}
