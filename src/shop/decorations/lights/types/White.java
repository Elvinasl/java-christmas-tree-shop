package shop.decorations.lights.types;

import shop.Product;
import shop.decorations.lights.Light;
import shop.decorations.lights.LightBehavior;
import shop.exceptions.NoLengthAvailable;

public class White extends Light implements LightBehavior, Product {

    public White(int length) throws NoLengthAvailable {
        super(length, "I'm just shining boring white!", 5.0, 0.03);
    }

    @Override
    public String getLabel() {
        return "White";
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getMessage() {
        return super.message;
    }
}
