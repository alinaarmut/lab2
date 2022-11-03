package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.*;


public class Carbink extends Pokemon {


    public Carbink(String name, int level) {
        super(name,level);
        setStats(50,50,150,50,50,500);
        setType(Type.ROCK,Type.FAIRY);
        setMove(new Facade(), new Swagger(), new DoubleTeam(), new Swagger());


    }
}
