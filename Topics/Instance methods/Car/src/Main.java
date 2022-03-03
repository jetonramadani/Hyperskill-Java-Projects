
class Car {

    int yearModel;
    String make;
    int speed;
    private final int five = 5;
    
    void accelerate() {
        this.speed += five;
    }

    void brake() {
        this.speed -= five;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}
