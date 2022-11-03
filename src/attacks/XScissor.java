package attacks;

import ru.ifmo.se.pokemon.*;

public class XScissor extends PhysicalMove {
    public XScissor() {
        super(Type.BUG, 80, 100);
    }
    @Override
    protected void applyOppDamage (Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe(){
        return "Использует X-Scissor";
    }
}
