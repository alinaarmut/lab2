package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Phantump extends Pokemon {


    public Phantump(String name, int level) {
        super(name,level);
        setStats(43,70,48,50,60,38);
        setType(Type.GHOST,Type.GRASS);
        setMove(new Growth(), new ShadowClaw(), new ShadowBall());


    }
}