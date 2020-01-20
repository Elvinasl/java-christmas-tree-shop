package shop.trees.types;

import shop.trees.ChristmasTree;
import shop.trees.IChristmasTree;

public class BlueSpruce extends ChristmasTree implements IChristmasTree {

    public BlueSpruce(int height) {
        super(height);
    }

    @Override
    public int getHeight() {
        return super.height;
    }
}
