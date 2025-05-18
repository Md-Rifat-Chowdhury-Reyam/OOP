package Class.InnerOrNested.Annonymous;

public class Example1 {

    // Anonymous Inner classes
    // Declaration Without any Name
    //As a subclass of the specified type

    void display()
    {
        System.out.println("I am from parent class");
    }


}

class ChildClass
{
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
    }
}
