import shop.Intratuin;
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
import shop.trees.ChristmasTree;
import shop.trees.types.BlueSpruce;
import shop.trees.types.NordMann;
import shop.trees.types.NorwaySpruce;
import shop.trees.types.Plastic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NoLengthAvailable, ChristmasBallTooBigException {
        Intratuin intratuin = new Intratuin(getProducts(), getTrees());
        intratuin.turnAllTrees();
        intratuin.printAllProducts();
    }

    private static List<Light> getLights() throws NoLengthAvailable {
        Light rgb = new Rgb(1);
        Light rgbFlickering = new RgbFlickering(5);
        Light rhbMobileApp = new RgbMobileApp(10);
        Light white = new White(30);

        List<Light> lights = new ArrayList<>();
        lights.add(rgb);
        lights.add(rgbFlickering);
        lights.add(rhbMobileApp);
        lights.add(white);
        return lights;
    }

    private Ball getBall() throws ChristmasBallTooBigException {
        return new ChristmasBall(10, ABall.Color.GOLD);
    }

    private static List<ChristmasTree> getTrees() throws NoLengthAvailable {
        List<ChristmasTree> trees = new ArrayList<>();
        getLights().forEach(light -> {
            ChristmasTree blueSpruce = new BlueSpruce(10, light);
            ChristmasTree nordMann = new NordMann(10, light);
            ChristmasTree norwaySpruce = new NorwaySpruce(10, light);
            ChristmasTree plastic = new Plastic(10, light);

            trees.add(blueSpruce);
            trees.add(nordMann);
            trees.add(norwaySpruce);
            trees.add(plastic);
        });
        return trees;
    }

    private static List<Product> getProducts() throws ChristmasBallTooBigException, NoLengthAvailable {
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
