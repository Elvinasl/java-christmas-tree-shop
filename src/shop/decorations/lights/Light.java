package shop.decorations.lights;

import shop.exceptions.NoLengthAvailable;

import java.util.Arrays;
import java.util.List;

public abstract class Light {

    private List<Integer> lengths = Arrays.asList(1, 5, 10, 30); //in meters
    protected int length;
    protected String message;

    public Light(int length, String message) throws NoLengthAvailable {
        if(lengths.contains(length)) {
            this.length = length * 100; // converting to cm
            this.message = message;
        } else {
            throw new NoLengthAvailable("Given length is not available in this shop!");
        }

    }

    public String getMessage() {
        return this.message;
    }
}
