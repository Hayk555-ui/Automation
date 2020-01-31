package Auto;

import com.sun.javaws.ui.LaunchErrorDialog;

public class Automain {

    public static void main(String[] args) {

        Autoclass sedan = new Autoclass("Mercedes", 60, "45 DC 458", false);
        Autoclass jeep = new Autoclass("BMW", 100, "47 GH 498", true);
        Autoclass roadster = new Autoclass("Ford", 150, "11 LL 111", true);
        Autoclass minivan = new Autoclass("Hyundai", 60, "24 GF 635", false);
//        sedan.isStateEngine();
//        sedan.setSpeed(0);
//        System.out.println("Car's speed at the moment is " + sedan.getSpeed());
//        sedan.setAcceleretion(44);
//        System.out.println("Car's speed now is alse " + sedan.getAcceleration());
//        sedan.setPetHamaranish("35 SX 422 ");
//        System.out.println(sedan.getPetHamaranish());
//        sedan.setMaxLimit(166);
//        System.out.println("Car's maxLimit is " + sedan.getMaxLimit());

        Parking parking = new Parking();
        parking.addCar(sedan);
        parking.addCar(jeep);
        parking.addCar(roadster);
        parking.getParkingInfo();
        parking.addCar(minivan);
//        parking.removeCar(1);



    }
}
