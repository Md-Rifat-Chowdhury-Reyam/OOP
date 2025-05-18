package Class.InnerOrNested.Annonymous;

//They are created in two ways.
//As a subclass of the specified type
//As an implementer of the specified interface

public class Example1 {

    // Anonymous Inner classes
    // Declaration Without any Name
    //As a subclass of the specified type

    void display()
    {
        System.out.println("I am from parent class");
    }


}

interface InterfaceAnnonymous
{
    void display();
}

class ChildClass
{
    static InterfaceAnnonymous ia = new InterfaceAnnonymous() {
        @Override
        public void display() {
            System.out.println("I am from Interface");

        }
    };


    //  An anonymous class with  as base class
    static Example1 ex = new Example1() {


    void display()
    {
        super.display();
        System.out.println("I am in base class");
    }

    };

    public static void main(String[] args) {
        ex.display();
        ia.display();
    }
}
