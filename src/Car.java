import beeps.Beaper;
import engs.Engine;

public abstract class Car {

    Beaper beaper;
    Engine engine;

    public Car(Beaper beaper,Engine engine){
        this.beaper = beaper;
        this.engine = engine;
    }
}
