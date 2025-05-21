package Constructor;

public class ConstructorOverloading {

    ConstructorOverloading()
    {
        System.out.println("I am default");

    }
    ConstructorOverloading(String name, int i)
    {
        System.out.println("name : " + name + " number : " + i);
    }
    ConstructorOverloading(float a)
    {
        System.out.println("float number : " + a);
    }

    public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading(2);
    }

    
}
