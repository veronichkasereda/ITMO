package Moves;


import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }

    Random random = new Random();
    int randomNumber = random.nextInt(101);

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.getCondition().equals(Status.FREEZE)) {
            p.restore();
        }
        else {
            if (randomNumber <= 30) {
                Effect.burn(p);
            }
        }
    }

    @Override
    protected String describe() {
        return "использует Scald";
    }
}
