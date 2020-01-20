package shop.decorations.balls;

public abstract class ABall {
    protected int diameter;
    protected Color color;
    protected enum Color {
        BLUE,
        RED,
        GOLD,
        WHITE
    }

    public ABall(int diameter, Color color) {
        this.diameter = diameter;
        this.color = color;
    }
}
