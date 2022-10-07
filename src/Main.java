import beeps.Beaper;
import beeps.BusSound;
import beeps.Horn;
import beeps.MagicSoung;
import engs.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

    Beaper horn = new Horn();
    Engine engineV12 = new EngineV12();

    Beaper MagicSoung = new MagicSoung();
    Engine EngineV6 = new EngineV6();

    Beaper BusSound = new BusSound();
    Engine BusEngine = new BusEngine();
    Engine ElectricEngine = new ElectricEngine();

    LongCar_1 longCar_1 = new LongCar_1(horn,ElectricEngine);

    Bus_1 bus_1 = new Bus_1(BusSound,BusEngine);
    Passat passat = new Passat(MagicSoung,EngineV6);
    Lambo lambo = new Lambo(horn,engineV12);

        System.out.println("Легковые авто: ");
        System.out.println(lambo.beaper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println(passat.beaper.makeSound());
        System.out.println(passat.engine.getSpeed());
        System.out.println("Автобусы: ");
        System.out.println(bus_1.beaper.makeSound());
        System.out.println(bus_1.engine.getSpeed());
        System.out.println(bus_1.pointPass());
        System.out.println("Грузовые: ");
        System.out.println(longCar_1.beaper.makeSound());
        System.out.println(longCar_1.engine.getSpeed());
        System.out.println(longCar_1.totalKg());

    }

}
