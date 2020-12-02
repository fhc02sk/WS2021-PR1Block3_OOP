package fraction;

public class Bruch {
    private int nenner;
    private int zaehler;
    public static int countBrueche;

    public Bruch(int zaehler, int nenner) {
        this.nenner = nenner;
        this.zaehler = zaehler;
        countBrueche++;
    }

    public static void printCountBrueche(){
        System.out.println("Statischer Count: " + countBrueche);
    }

    public int getNenner() {
        return nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public double toDecimal(){
        return zaehler / (nenner * 1.0);
    }

    public void print() {
        System.out.println(zaehler + " / " + nenner);
    }

//   public fraction.Bruch multiplicate(fraction.Bruch b2) {
//        /* 5 / 7 * 3 / 4 = 15 / 28 */
//        int zaehler_neu = this.zaehler * b2.getZaehler();
//        int nenner_neu = this.nenner * b2.getNenner();
//
//        fraction.Bruch neuerBruch = new fraction.Bruch(zaehler_neu, nenner_neu);
//        return neuerBruch;
//    }

    public Bruch multiplicate(Bruch b2) {
        /* 5 / 7 * 3 / 4 = 15 / 28 */
        return new Bruch(this.zaehler * b2.getZaehler(),
                this.nenner * b2.getNenner());
    }

    public Bruch multiplicate(Bruch b2, Bruch b3){
        int zaehler_neu = this.zaehler * b2.getZaehler() * b3.getZaehler();
        int nenner_neu = this.nenner * b2.getNenner() * b3.getNenner();

        return new Bruch(zaehler_neu, nenner_neu);
    }

  /*  public fraction.Bruch multiplicate(fraction.Bruch b2, fraction.Bruch b3){
        return multiplicate(b2).multiplicate(b3);
    }*/

    public Bruch multiplicate(Bruch[] arr){
        int zaehler_neu = this.zaehler;
        int nenner_neu = this.nenner;

        for (int i = 0; i < arr.length; i++){
            Bruch b2 = arr[i];
            zaehler_neu = zaehler_neu * b2.getZaehler();
            nenner_neu = nenner_neu * b2.getNenner();
        }
        return new Bruch(zaehler_neu, nenner_neu);
    }

}
