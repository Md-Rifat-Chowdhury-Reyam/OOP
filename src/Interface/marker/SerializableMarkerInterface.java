package Interface.marker;

public class SerializableMarkerInterface {
    public static void main(String[] args) {

        Person p = new Person();
        Animal a= new Animal();

        if(p instanceof Serializable)
        {
            System.out.println("person class is serializable");
        }
        else
        {
            System.out.println("Person class is not serializable");
        }

        if(a instanceof Serializable)
        {
            System.out.println("Animal class is serializable");
        }
        else
        {
            System.out.println("Animal class is not serializable");
        }
    }
}

interface Serializable //marker interface
{
    //having no method
    //having no field
}
class Person implements Serializable
{
    public Person()
    {
        System.out.println("I am constructor from Person class");
    }
}

class Animal
{
    Animal()
    {
        System.out.println("I am Constructor from animal class");
    }
}

