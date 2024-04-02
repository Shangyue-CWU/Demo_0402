class Wheel {
    // Wheel implementation ok
}

class Car {
    private Wheel wheel;

    public Car() {
        // The Car class controls the creation of Wheel objects.
        this.wheel = new Wheel();
    }
}
