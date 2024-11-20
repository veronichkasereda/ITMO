package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Porygon extends Pokemon {
    public Porygon(String name, int level) { //это конструктор
        super(name, level);
        setType(Type.NORMAL); //смотреть на сайте с кружочком
        setStats(65, 60, 70, 85, 75, 40); //смотреть на сайте с чувачком
        setMove(new ChargeBeam(), new Psychic());
    }
}
