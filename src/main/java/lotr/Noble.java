package lotr;

import java.util.Random;

public abstract class Noble extends Character {
    public Noble(int hp, int power) {
        super(hp, power);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(getPower() + 1));
    }
}
