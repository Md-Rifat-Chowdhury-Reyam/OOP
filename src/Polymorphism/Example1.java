package Polymorphism;

public class Example1 {
    public static void main(String[] args) {

        A a = new A(); //object calling for method overloading
        a.printInfo();
        a.printInfo("Rifat", 3);

        B b = new B();
        b.printInfo();

        // Polymorphism in action
        A parentClassObject = new B(); //referring child class
        parentClassObject.printInfo("Nobita", 4);


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
}

class B extends A
{
    // Method Overriding (runtime)
    @Override
    void printInfo() {
        super.printInfo();
    }
}