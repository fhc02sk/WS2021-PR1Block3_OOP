public class DemoSpeedCarApp {
    public static void main(String[] args) {

        SpeedCar sp = new SpeedCar();
        sp.colour = "red";
        //sp.currentGear = 1;
        sp.setCurrentGear(1);
        sp.currentSpeed = 0;

        sp.print();
        sp.nextGear();
        /*sp.nextGear();
        sp.print();
        sp.nextGear();
        sp.setSpeed(150);
        sp.print();*/
        sp.print();

        sp.accelerate();
        sp.print(); // 10km/h
        sp.accelerate();
        sp.accelerate();
        sp.accelerate();
        sp.accelerate();
        sp.print(); // 50km/h
        sp.accelerate(160);
        sp.print(); // 160 km/h


        sp.setSpeed(200);
        sp.print();

        sp.setCurrentGear(99);
        sp.print();
        System.out.println("sp.getCurrentGear() = " + sp.getCurrentGear());
    }
}
