package shop.decorations.lights.types;

import shop.Product;
import shop.decorations.lights.Light;
import shop.decorations.lights.LightBehavior;
import shop.exceptions.NoLengthAvailable;

public class White extends Light implements LightBehavior, Product {

    public White(int length) throws NoLengthAvailable {
        super(length, "I'm just shining boring white!");
    }

    @Override
    public String getLabel() {
        return "White";
    }

    @Override
    public double getPrice() {
        return 5 + super.length * 0.03;
    }

    @Override
    public String getMessage() {
        return super.message;
    }
}
