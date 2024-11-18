package Pokemons;

import Moves.DreamEater;
import ru.ifmo.se.pokemon.Type;

public class PorygonZ extends Porygon2 {
    public PorygonZ(String name, int level) { //это конструктор
        super(name, level);
        setType(Type.NORMAL); //смотреть на сайте с кружочком
        setStats(85, 80, 70, 135, 75, 90); //смотреть на сайте с чувачком
        setMove(new DreamEater());
    }
}
