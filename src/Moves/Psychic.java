package Moves;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class Psychic extends SpecialMove {
    public Psychic(){

        super(Type.PSYCHIC, 90, 100);
    }

    Random random = new Random();
    int randomNumber = random.nextInt(101);

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (randomNumber <= 10) {
            p.setMod(Stat.SPECIAL_ATTACK, -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Psychic";
    }
}
