public class Konto {
    private String kontoInhaber;
    private double kontostand;

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
        System.out.println("Kontoinhaber: " + kontoInhaber + ": Kontostand: " + kontostand + " EUR");
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
