package Pokemons;


import Moves.DefenseCurl;
import ru.ifmo.se.pokemon.Type;

public class Porygon2 extends Porygon {
    public Porygon2(String name, int level) { //это конструктор
        super(name, level);
        setType(Type.NORMAL); //смотреть на сайте с кружочком
        setStats(85, 80, 90, 105, 95, 60); //смотреть на сайте с чувачком
        addMove(new DefenseCurl());
    }
}