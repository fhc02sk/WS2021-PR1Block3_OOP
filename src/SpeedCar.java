public class SpeedCar {
    public int currentSpeed;
    private int currentGear;
    public String colour;

    public int getCurrentGear(){
        return currentGear;
    }

    public void setCurrentGear(int currentGear){
        if (currentGear >= 1 && currentGear <= 7)
            this.currentGear = currentGear;
        else {
            System.out.println("Falscher Gang, erlaubt ist 1 bis 7");
        }
    }

    public void print() {
        System.out.println("Farbe: " + colour + "; CurrentGear: "
                + currentGear + "; CurrentSpeed: " + currentSpeed + " km/h");
    }

    // Methode, ohne Rückgabe (void), mit Parameter
    public void setSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
        defineBestGear();
    }

    // Methode, ohne Rückgabe, ohne Parameter
    public void nextGear() {
        currentGear++;
    }

    // Methode, mit Rückgabe (int), ohne Parameter
    /*public int getGear() {
        return currentGear;
    }*/

    public void accelerate(int targetSpeed) {
        currentSpeed = targetSpeed;
        defineBestGear();
    }

    private void defineBestGear(){
        // Wie, wann wir schalten
        if (currentSpeed <= 30)
            currentGear = 1;
        else if (currentSpeed <= 50)
            currentGear = 2;
        else if (currentSpeed <= 100)
            currentGear = 3;
        else if (currentSpeed <= 150)
            currentGear = 4;
        else
            currentGear = 5;
    }

    public void accelerate() {
        accelerate(currentSpeed + 10);
    }
}
