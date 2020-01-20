package shop.decorations.lights.types;

import shop.Product;
import shop.decorations.lights.Light;
import shop.decorations.lights.LightBehavior;
import shop.exceptions.NoLengthAvailable;

public class RgbMobileApp extends Light implements LightBehavior, Product {

    public RgbMobileApp(int length) throws NoLengthAvailable {
        super(length, "I'm completely future proof!", 95.0, 0.6);
    }

    @Override
    public String getLabel() {
        return "RGB mobile app";
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
