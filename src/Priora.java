import beeps.Beaper;
import engs.Engine;

import java.awt.*;

public class Priora extends Car{
    public Priora(Beaper beaper, Engine engine) {
        super(beaper, engine);
    }
    String downShift(){
        return "DownShifting";
    }
}
