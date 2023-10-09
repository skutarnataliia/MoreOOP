package lotr;

public class Main {
    public static void main(String[] args) {
        GameManager game1 = new GameManager();
        game1.fight(CharacterFactory.createCharacter(), CharacterFactory.createCharacter());
    }
}
