import ru.ifmo.se.pokemon.*;
import pokemons.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Carbink p1 = new Carbink("Vasya", 1);
        Hydreigon p2 = new Hydreigon("Katya",3);
        Deino p3 = new Deino("Sasha",1);
        Phantump p4 = new Phantump("Mia",2);
        Trevenant p5 = new Trevenant("Roma",3);
        Zweilous p6 = new Zweilous("Kirill",2);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();

    }
}