import Pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Bibarel("Биба", 5));
        b.addFoe(new Bidoof("Боба", 4));
        b.addAlly(new Bouffalant("Пупсень", 5));
        b.addFoe(new Porygon("Вупсень", 4));
        b.addAlly(new Porygon2("Пур", 1));
        b.addFoe(new PorygonZ("Пир", 1));
        b.go();


    }
}