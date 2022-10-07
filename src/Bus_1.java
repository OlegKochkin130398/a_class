import beeps.Beaper;
import engs.Engine;

public class Bus_1 extends Car{
    public Bus_1(Beaper beaper, Engine engine) {
        super(beaper, engine);
    }
    String pointPass(){
        return "30 пассажиров!";
    }
}
