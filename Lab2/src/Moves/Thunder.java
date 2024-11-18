package Moves;


import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110, 70);
    }
    Random random = new Random();
    int randomNumber = random.nextInt(101);

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (randomNumber <= 30) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Thunder";
    }
}