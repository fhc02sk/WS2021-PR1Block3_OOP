public class DemoBruchApp {

    public static void main(String[] args) {

        Bruch b1 = new Bruch(5, 7);
        System.out.println("b1.toDecimal() = " + b1.toDecimal());
        b1.print();

        System.out.println("b1.countBrueche = " + b1.countBrueche);

        Bruch dreiViertel = new Bruch(3, 4);
        System.out.println("dreiViertel.countBrueche = " + dreiViertel.countBrueche);
        System.out.println("b1.countBrueche = " + b1.countBrueche);
        System.out.println("Bruch.countBrueche = " + Bruch.countBrueche);

        Bruch erg = b1.multiplicate(dreiViertel);
        System.out.println("erg.toDecimal() = " + erg.toDecimal());
        erg.print();

        Bruch fuenfSechstel = new Bruch(5, 6);
        Bruch erg2 = erg.multiplicate(fuenfSechstel);
        erg2.print();


        Bruch erg3 = b1.multiplicate(dreiViertel, fuenfSechstel);
        erg3.print();

        Bruch einHalb = new Bruch(1, 2);

        print(erg3);
        System.out.println("Bruch.countBrueche = " + Bruch.countBrueche);
        Bruch.printCountBrueche();

    }

    public static void print(Bruch b){
        System.out.println(b.getZaehler() + " / " + b.getNenner() + " = " + b.toDecimal() );
    }
}
