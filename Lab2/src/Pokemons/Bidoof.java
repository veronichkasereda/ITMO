package Pokemons;

import Moves.ChargeBeam;
import Moves.Tackle;
import Moves.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bidoof extends Pokemon {
    public Bidoof(String name, int level){ //это конструктор
        super(name, level);
        setType(Type.NORMAL); //смотреть на сайте с кружочком
        setStats(59,	45,	40,	35,	40,	31); //смотреть на сайте с чувачком
        setMove(new Tackle(), new ChargeBeam(), new Thunder());
    }
}
