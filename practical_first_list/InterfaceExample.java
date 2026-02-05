interface Vehicle {
    void start();
    void stop();
    void accelerate();
    void brake();
    void honk();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking...");
    }

    @Override
    public void honk() {
        System.out.println("Car is honking...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.honk();
        myCar.stop();
    }
}