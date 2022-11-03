package attacks;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw() {
        super(Type.GHOST, 70, 100);
    }
    @Override
    protected void applyOppDamage (Pokemon def, double damage) {
        def.setMod(Stat.HP,(int)Math.round(damage)/8);

    }
    @Override
    protected String describe(){
        return "Использует ShadowClaw";
    }
}
