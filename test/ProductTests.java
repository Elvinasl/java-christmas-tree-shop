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

import static shop.exceptions.Messages.BALL_SIZE_MESSAGE;
import static shop.exceptions.Messages.LIGHT_LENGTH_MESSAGE;

public class ProductTests {

    @Test
    public void testLightException() {
        try {
            new Rgb(31);
        } catch (NoLengthAvailable noLengthAvailable) {
            assert noLengthAvailable.getMessage().equals(LIGHT_LENGTH_MESSAGE);
        }
    }

    @Test
    public void testBallException() {
        try {
            new ChristmasBall(31, ABall.Color.RED);
        } catch (ChristmasBallTooBigException e) {
           assert e.getMessage().equals(BALL_SIZE_MESSAGE);
        }
    }

    @Test
    public void testBallPrices() throws ChristmasBallTooBigException {
        Ball red = new ChristmasBall(10, ABall.Color.RED);
        Ball blue = new ChristmasBall(10, ABall.Color.BLUE);
        Ball gold = new ChristmasBall(10, ABall.Color.GOLD);
        Ball white = new ChristmasBall(10, ABall.Color.WHITE);

        assert red.getColor().equals(ABall.Color.RED);
        assert red.getPrice() == 1.10;
        assert blue.getPrice() == 1;
        assert gold.getPrice() == 1.5;
        assert white.getPrice() == 0.8;
    }

    @Test
    void testLights() throws NoLengthAvailable {
        Light rgb = new Rgb(10);
        Light rgbFlickering = new RgbFlickering(5);
        Light rgbMobile = new RgbMobileApp(10);
        Light white = new White(30);

        // testing messages
        assert rgb.getMessage().length() > 2;
        assert rgbFlickering.getMessage().length() > 2;
        assert rgbMobile.getMessage().length() > 2;
        assert white.getMessage().length() > 2;

        // testing price calculations
        assert rgb.getPrice() == 8.0;
        assert rgbFlickering.getPrice() == 49.5;
        assert rgbMobile.getPrice() == 695.0;
        assert white.getPrice() == 95.0;
    }

    @Test
    void testTreeWithBalls() throws ChristmasBallTooBigException {
        Product blueSpruce = new BlueSpruce(5, getBalls());

        assert blueSpruce.getPrice() == 24.4;
        assert blueSpruce.getLabel().length() > 5;
    }

    @Test
    void testTreeWithLights() throws NoLengthAvailable {
        Product nordMann = new NordMann(5, new RgbMobileApp(10));

        assert nordMann.getLabel().length() > 5;
        assert nordMann.getPrice() == 725.0;
    }

    @Test
    void testTreeWithBallsAndLights() throws ChristmasBallTooBigException, NoLengthAvailable {
        Product norwaySpruce = new NorwaySpruce(10, new RgbFlickering(5), getBalls());

        assert norwaySpruce.getLabel().length() > 2;
        assert norwaySpruce.getPrice() == 73.9;
    }

    @Test
    void testTreeWithNoDecorations() {
        Product plastic = new Plastic(10);

        assert plastic.getLabel().length() > 2;
        assert plastic.getPrice() == 10;
    }

    private List<Ball> getBalls() throws ChristmasBallTooBigException {
        List<Ball> balls = new ArrayList<>();
        // ball
        balls.add(new ChristmasBall(20, ABall.Color.RED));
        balls.add(new ChristmasBall(10, ABall.Color.GOLD));
        balls.add(new ChristmasBall(20, ABall.Color.WHITE));
        balls.add(new ChristmasBall(20, ABall.Color.BLUE));
        return balls;
    }
}
