package lotr;

import java.util.Random;

public class Knight extends Noble{
    public Knight() {
        super(new Random().nextInt(10) + 2, new Random().nextInt(10) + 2);
    }
}
