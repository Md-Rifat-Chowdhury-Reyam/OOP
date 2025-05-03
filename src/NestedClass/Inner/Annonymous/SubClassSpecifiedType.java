package NestedClass.Inner.Annonymous;

public class SubClassSpecifiedType {

    void display()
    {
        System.out.println("I am from SubClassSpecifiedType or super class");
    }

}

class Annonymousclass
{

    //An anonymous class with super class as base class
    static SubClassSpecifiedType sc = new SubClassSpecifiedType()
    {
        void display()//In anonymous class display() method is overridden.
        {
            super.display();

            System.out.println("I am from annonymous");
        }


    };


    public static void main(String[] args) {

        sc.display();

    }
}