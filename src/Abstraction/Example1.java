package Abstraction;

// Abstract class representing a Vehicle (hiding implementation details)
abstract class Vehicle
{
    //abstract method
    abstract void brand(String name);
    abstract void model(String name);

    //common method
    //concrete method
     void startEngine()
     {
         System.out.println("Engine started : ");
     }

}

public class Example1 extends  Vehicle
{
    @Override
    void brand(String name)
    {
        System.out.println("Brand name : " + name);
    }

    @Override
    void model(String  name)
    {
        System.out.println("Model is : "  + name);
    }

    public static void main(String[] args) {
        Vehicle vc = new Example1();

        vc.brand("Tata");
        vc.model("Nano");
        vc.startEngine();
    }
}
