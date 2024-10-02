/*
5.    Create classes for a Car and an Engine. The Car class should contain an instance of the Engine class. 
Implement methods to start and stop the car, and display engine details.
*/

package assignment6;

class Engine {
    private String engineType;
    private int horsepower;

    public Engine(String engineType, int horsepower) {
        this.engineType = engineType;
        this.horsepower = horsepower;
    }

    public void displayEngineDetails() {
        System.out.println("Engine Type: " + engineType);
        System.out.println("Horsepower: " + horsepower + " HP");
    }

    
    public void startEngine() {
        System.out.println("Engine is starting...");
    }

    
    public void stopEngine() {
        System.out.println("Engine is stopping...");
    }
}


class Car {
    private String model;
    private Engine engine;  

    
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    
    public void startCar() {
        System.out.println(model + " is starting.");
        engine.startEngine();
    }

    
    public void stopCar() {
        System.out.println(model + " is stopping.");
        engine.stopEngine();
    }

    
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        engine.displayEngineDetails();
    }
}


public class TestEngine {

	public static void main(String[] args) {
		Engine engine = new Engine("V8", 400);

        Car car = new Car("Ford Mustang", engine);
        car.displayDetails();
        car.startCar();
        car.stopCar();

	}

}
