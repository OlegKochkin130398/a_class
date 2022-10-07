import beeps.Beaper;
import engs.Engine;

public class Lambo extends Car {
    public Lambo(Beaper beaper, Engine engine) {
        super(beaper, engine);
    }

    String getCost(){
        return "30000000";
    }
}
