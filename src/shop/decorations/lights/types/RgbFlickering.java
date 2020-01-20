package shop.decorations.lights.types;

import shop.Product;
import shop.decorations.lights.Light;
import shop.decorations.lights.LightBehavior;
import shop.exceptions.NoLengthAvailable;

public class RgbFlickering extends Light implements LightBehavior, Product {

    public RgbFlickering(int length) throws NoLengthAvailable {
        super(length, "I am ready to have a little party!");
    }

    @Override
    public String getLabel() {
        return "RGB Flickering";
    }

    @Override
    public double getPrice() {
        return 9.50 + super.length * 0.08;
    }

    @Override
    public String getMessage() {
        return super.message;
    }
}
