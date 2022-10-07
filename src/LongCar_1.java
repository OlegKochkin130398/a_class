import beeps.Beaper;
import engs.Engine;

public class LongCar_1 extends Car{
    public LongCar_1(Beaper beaper, Engine engine) {
        super(beaper, engine);
    }
    String totalKg(){
        return "12000 Т";
    }
}
