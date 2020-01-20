package shop.decorations.lights;

import shop.exceptions.Messages;
import shop.exceptions.NoLengthAvailable;

import java.util.Arrays;
import java.util.List;

import static shop.exceptions.Messages.LIGHT_LENGTH_MESSAGE;

public abstract class Light {

    private List<Integer> lengths = Arrays.asList(1, 5, 10, 30); //in meters
    protected int length;
    protected double pricePerLength;
    protected double price;
    protected String message;

    public Light(int length, String message, double price, double pricePerLength) throws NoLengthAvailable {
        if(lengths.contains(length)) {
            this.length = length * 100; // converting to cm
            this.message = message;
            this.price = price;
            this.pricePerLength = pricePerLength;
        } else {
            throw new NoLengthAvailable(LIGHT_LENGTH_MESSAGE);
        }

    }

    public String getMessage() {
        return this.message;
    }

    public double getPrice() {
        return price + pricePerLength * length;
    }
}
