package attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleHit extends PhysicalMove {
    public DoubleHit() {
        super(Type.NORMAL, 35, 90);
    }
    @Override
    protected void applyOppDamage (Pokemon def, double damage){
        def.setMod(Stat.HP, (int) (damage*2));

    }
    @Override
    protected String describe(){
        return "использует DoubleHit";
    }
}
