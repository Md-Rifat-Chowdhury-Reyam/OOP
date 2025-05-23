package Polymorphism;

public class Example1 {
    public static void main(String[] args) {

        A a = new A(); //object calling for method overloading
        a.printInfo();
        a.printInfo("Rifat", 3);

        B b = new B();
        b.printInfo();

        //Dynamic dispatch
        A parentClassObject = new B(); //referring type parent class and initializing child class
        // Polymorphism in action
        parentClassObject.printInfo("Nobita", 4);

        // If a Parent type reference refers
        // to a Child object Child's method
        // is called. This is called RUN TIME
        // POLYMORPHISM.


    }
}

class A
{
    //method
    void printInfo()
    {
        System.out.println("Name is Method overloading");
    }

    // Method Overloading (compile-time)
    void printInfo(String name, int id)
    {
        System.out.println("name is : " + name + " id is " + id);
    }

    static void metd() // // Static method in base class
    // which will be hidden in subclass
    {
        System.out.println("static");
    }
}

class B extends A
{
    // Method Overriding (runtime)
    @Override
    void printInfo() {
        super.printInfo();
    }
}