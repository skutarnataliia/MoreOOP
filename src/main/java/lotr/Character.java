package lotr;

import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    public void setPower(int power) {
        this.power = power > 0 ? power : 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}