public class KontoDemoApp {
    public static void main(String[] args) {

        Konto kontoMax = new Konto("Max Mustermann");
        kontoMax.aufbuchen(1000);

        Konto kontoSusi = new Konto("Susi Sorglos");
        kontoSusi.aufbuchen(2_000);

        kontoMax.print();
        kontoSusi.print();

        kontoMax.abbuchen(800);
        kontoMax.print();

        kontoMax.abbuchen(300);
        kontoMax.print();

        kontoSusi.abbuchen(200);
        kontoSusi.print();

        System.out.println("kontoSusi.getKontoInhaber() = " + kontoSusi.getKontoInhaber());

        Konto kontoJohn = new Konto("John Doe");
        kontoJohn.aufbuchen(50_000);
        kontoJohn.abbuchen(100);
        kontoJohn.print();

        Konto aktionsKonto = new Konto("Franz Muster", 500);
        aktionsKonto.aufbuchen(300);
        aktionsKonto.print();


    }
}
