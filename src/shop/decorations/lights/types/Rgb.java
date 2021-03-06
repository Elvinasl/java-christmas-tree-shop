package shop.decorations.lights.types;

import shop.Product;
import shop.decorations.lights.Light;
import shop.decorations.lights.LightBehavior;
import shop.exceptions.NoLengthAvailable;

public class Rgb extends Light implements LightBehavior, Product {

    public Rgb(int length) throws NoLengthAvailable {
        super(length, "I am giving a little bit more color to your life!", 8.0, 0.05);
    }

    @Override
    public String getLabel() {
        return "RGB";
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public String getMessage() {
        return super.message;
    }
}
