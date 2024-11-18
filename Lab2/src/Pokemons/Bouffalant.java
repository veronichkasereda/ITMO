package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import Moves.AerialAce;
import Moves.Amnesia;
import Moves.DoubleTeam;
import Moves.HeadCharge;

public class Bouffalant extends Pokemon {
    public Bouffalant(String name, int level) { //это конструктор
        super(name, level);
        setType(Type.NORMAL); //смотреть на сайте с кружочком
        setStats(95, 110, 95, 40, 95, 55); //смотреть на сайте с чувачком
        setMove(new HeadCharge(), new Amnesia(), new DoubleTeam(), new AerialAce());
    }
}
