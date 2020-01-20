import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import shop.Product;
import shop.decorations.balls.ABall;
import shop.decorations.balls.Ball;
import shop.decorations.balls.ChristmasBall;
import shop.decorations.lights.Light;
import shop.decorations.lights.types.Rgb;
import shop.decorations.lights.types.RgbFlickering;
import shop.decorations.lights.types.RgbMobileApp;
import shop.decorations.lights.types.White;
import shop.exceptions.ChristmasBallTooBigException;
import shop.exceptions.NoLengthAvailable;
import shop.trees.types.BlueSpruce;
import shop.trees.types.NordMann;
import shop.trees.types.NorwaySpruce;
import shop.trees.types.Plastic;

import java.util.ArrayList;
import java.util.List;

public class ProductTests {

    @Test
    public void testLightException() {
        try {
            new Rgb(31);
        } catch (NoLengthAvailable noLengthAvailable) {
            assert noLengthAvailable.getMessage().length() > 2;
        }
    }

    @Test
    public void testBallException() {
        try {
            new ChristmasBall(31, ABall.Color.RED);
        } catch (ChristmasBallTooBigException e) {
           assert e.getMessage().length() > 2;
        }
    }

    private List<Product> getProducts() throws ChristmasBallTooBigException, NoLengthAvailable {
        List<Product> products = new ArrayList<>();
        // ball
        products.add(new ChristmasBall(20, ABall.Color.RED));
        //lights
        products.add(new Rgb(10));
        products.add(new RgbFlickering(5));
        products.add(new RgbMobileApp(10));
        products.add(new White(30));
        // trees
        products.add(new BlueSpruce(10, new Rgb(10)));
        products.add(new NordMann(20, new RgbFlickering(5)));
        products.add(new NorwaySpruce(10, new White(30)));
        products.add(new Plastic(30, new RgbMobileApp(5)));

        return products;
    }
}
