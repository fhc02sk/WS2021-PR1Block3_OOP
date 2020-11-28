package accounts;

public class Konto {
    private String kontoInhaber;
    private double kontostand;
    private int kontoID;

    private static int counter;

    public Konto(String kontoInhaber){
        this.kontoInhaber = kontoInhaber;
        kontostand = 0;
        counter++;
        kontoID = counter;
    }

    public Konto(String kontoInhaber, double kontostand){
        this.kontoInhaber = kontoInhaber;
        this.kontostand = kontostand;
        counter++;
        kontoID = counter;
    }

    public void setKontoInhaber(String kontoInhaber){
        this.kontoInhaber = kontoInhaber;
        this.kontostand = 0;
    }

    public String getKontoInhaber() {
        return kontoInhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void print(){
        System.out.println("KontoID: " + kontoID + ": Kontoinhaber: "
                + kontoInhaber + ": Kontostand: " + kontostand + " EUR"
                + ": Gesamtanzahl Konten: " + counter);
    }

    public void aufbuchen(double wert){
        this.kontostand += wert;
        //kontostand = kontostand + wert;
    }

    public void abbuchen(double wert) {
        if (kontostand - wert >= 0) {
            kontostand -= wert;
        }
        else {
            kontostand = 0;
        }
    }
}
