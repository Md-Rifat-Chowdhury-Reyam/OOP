package Constructor;

public class ConstructorChaining {
    /**
     * What happens if we change the order of constructors?
     * Nothing, Constructor chaining can be achieved in any order
     */
    //same class using this() keyword
    ConstructorChaining()
    {
        this("Rifat"); //calling 2nd constructor
        System.out.println("I am default");
    }

    ConstructorChaining(String name)
    {
        this(2, "Rifat"); //calling to 3rd constructor
        System.out.println("Name --> " + name );
    }

    ConstructorChaining(double n, String name)
    {
        System.out.println("Number --> " + n +  " name --> " + name);
    }


    public static void main(String[] args) {
        ConstructorChaining cc = new ConstructorChaining();

        child cd = new child("Reyam");

    }
}

//Using super() keyword base class constructor chaining

class child extends ConstructorChaining
{
    child()
    {
        System.out.println("I am default");

    }
    child(String name)
    {
        super(name); //calling to base class 2nd constructor
        System.out.println("name from Child class called by super "  + name);
    }
}