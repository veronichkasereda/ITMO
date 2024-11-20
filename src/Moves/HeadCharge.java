package Moves;

import ru.ifmo.se.pokemon.*;

public class HeadCharge extends PhysicalMove {
    public HeadCharge(){
        super(Type.NORMAL, 120, 110);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        super.applyOppDamage(p, v);
    }

    @Override
    protected void applySelfDamage(Pokemon p, double v) {
        p.setMod(Stat.HP, (int) (v/4));
    }
    @Override
    protected String describe() {
        return "использует Head Charge";
    }
}
