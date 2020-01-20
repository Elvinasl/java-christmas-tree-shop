package shop.decorations.balls;

import shop.Product;
import shop.exceptions.ChristmasBallTooBigException;

public class ChristmasBall extends ABall implements Ball, Product {

    public ChristmasBall(int diameter, Color color) throws ChristmasBallTooBigException {
        super(diameter, color);
    }

    @Override
    public String getLabel() {
        return "Christmas Ball";
    }

    @Override
    public double getPrice() {
        if(getColor().equals(Color.BLUE)) {
            return 1;
        }

        if(getColor().equals(Color.RED)) {
            return 1.10;
        }

        if(getColor().equals(Color.GOLD)) {
            return 1.5;
        }

        if(getColor().equals(Color.WHITE)) {
            return 0.8;
        }
        return 0;
    }

    @Override
    public int getDiameter() {
        return super.diameter;
    }

    @Override
    public Color getColor() {
        return super.color;
    }
}
