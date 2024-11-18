package Pokemons;


import Moves.Scald;
import ru.ifmo.se.pokemon.Type;

public class Bibarel extends Bidoof {
    public Bibarel(String name, int level) { //это конструктор
        super(name, level);
        setType(Type.NORMAL, Type.WATER); //смотреть на сайте с кружочком
        setStats(79, 85, 60, 55, 60, 71); //смотреть на сайте с чувачком
        setMove(new Scald());
    }
}
