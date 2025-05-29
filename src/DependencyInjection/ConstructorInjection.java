package DependencyInjection;

import javax.smartcardio.Card;

public class ConstructorInjection {
    public static void main(String[] args) {
        Engine en = new Engine(); // Create Engine object (dependency)
        Car c = new Car(en);
        c.drive();
    }

}

class Engine
{
    public  void start()
    {
        System.out.println("Engine stated ");
    }
}

class Car
{
    private  Engine engineObject;// Declaring a dependency on Engine

    //car constructor
    // Constructor Injection: Dependency is provided through the constructor
    public Car(Engine engine)
    {
        this.engineObject = engine;// Engine dependency is injected via constructor
    }

    public  void drive()
    {
        engineObject.start(); // Using the injected Engine dependency
        System.out.println("car is driving ");
    }
}