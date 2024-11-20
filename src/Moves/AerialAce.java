package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove {
    public AerialAce(){
        super(Type.FLYING, 0, 0);
    }


    @Override
    protected String describe() {
        return "использует Aerial ace";
    }
}
