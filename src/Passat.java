import beeps.Beaper;
import engs.Engine;

public class Passat extends Car{
    public Passat(Beaper beaper, Engine engine) {
        super(beaper, engine);
    }

    String logo(){
        return "VW";
    }
}
