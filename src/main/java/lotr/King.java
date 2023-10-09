package lotr;

import java.util.Random;

public class King extends Noble{
    public King() {
        super(new Random().nextInt(10) + 5, new Random().nextInt(10) + 5);
    }
}
