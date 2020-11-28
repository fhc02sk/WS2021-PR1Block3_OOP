public class SpeedCar {
    public int currentSpeed;
    public int currentGear;
    public String colour;



    public void print() {
        System.out.println("Farbe: " + colour + "; CurrentGear: "
                + currentGear + "; CurrentSpeed: " + currentSpeed + " km/h");
    }

    // Methode, ohne Rückgabe (void), mit Parameter
    public void setSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }

    // Methode, ohne Rückgabe, ohne Parameter
    public void nextGear() {
        currentGear++;
    }

    // Methode, mit Rückgabe (int), ohne Parameter
    public int getGear() {
        return currentGear;
    }

    public void accelerate(int targetSpeed) {

        currentSpeed = targetSpeed;
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
