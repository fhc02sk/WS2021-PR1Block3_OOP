public class DemoClassApp {

    public static void main(String[] args) {
        System.out.println("Demo zur Car-Klasse");

        int intporsche911 = 911;
        /*
        Car porsche911; // Deklaration
        porsche911 = new Car(); // Instanziierung
        */
        Car porsche911 = new Car();
        porsche911.manufacturer = "Porsche";
        porsche911.productionYear = 2020;
        porsche911.colour = "green";
        porsche911.countDoors = 3;
        porsche911.currentGear = 1;

        Car golf8 = new Car();
        golf8.manufacturer = "VW";
        golf8.productionYear = 2018;
        golf8.countDoors = 5;
        golf8.colour = "black";
        golf8.currentGear = 1;

        System.out.println("golf8.manufacturer = " + golf8.manufacturer);
        System.out.println("golf8.countDoors = " + golf8.countDoors);

        System.out.println("porsche911.manufacturer = " + porsche911.manufacturer);

        Car audiA3 = new Car();
        audiA3.manufacturer = "Audi";

    }

}
