package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove {
    public Tackle() {

        super(Type.NORMAL, 40, 100);
    }

    @Override
    public void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
    }

    @Override
    protected String describe() {
        return "использовал атаку Tackle и нанес урон противнику ";

    }
}