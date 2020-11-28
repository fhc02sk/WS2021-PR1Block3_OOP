public class KontoDemoApp {
    public static void main(String[] args) {

        Konto kontoMax = new Konto();
        kontoMax.setKontoInhaber("Max Mustermann");
        kontoMax.aufbuchen(1000);

        Konto kontoSusi = new Konto();
        kontoSusi.setKontoInhaber("Susi Sorglos");
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
    }
}
