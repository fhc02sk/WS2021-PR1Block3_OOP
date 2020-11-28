public class DemoBruchApp {

    public static void main(String[] args) {

        Bruch b1 = new Bruch(5, 7);
        System.out.println("b1.toDecimal() = " + b1.toDecimal());
        b1.print();

        Bruch dreiViertel = new Bruch(3, 4);

        Bruch erg = b1.multiplicate(dreiViertel);
        System.out.println("erg.toDecimal() = " + erg.toDecimal());
        erg.print();

        Bruch fuenfSechstel = new Bruch(5, 6);
        Bruch erg2 = erg.multiplicate(fuenfSechstel);
        erg2.print();


        Bruch erg3 = b1.multiplicate(dreiViertel, fuenfSechstel);
        erg3.print();

    }
}
