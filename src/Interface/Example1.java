package Interface;

interface InterfaceName{

    //By default, variables or data field or constants in an interface are public, static, and final.
    int CONS = 10;
    final int a = 2022; //By default, variables in an interface are public, static, and final.

    // Abstract method (public abstract by default)
            //abstract method can't have body
    void print();

    // Default method (JDK 8+)
    default void defaultMethodName()
    {
        System.out.println("interface can have default method");
    }

    // Static method (JDK 8+)
    static void staticMethod() {

        System.out.println("Static method in interface");

    }
    // Private method (JDK 9+)
    private void privateMethod() {

        System.out.println("Private helper method");

    }

}


public class Example1 implements InterfaceName {

    @Override
    public void print() {
        System.out.println("Override abstract method");
    }


    public static void main(String[] args) {
        Example1 e = new Example1();
        e.print();
        
    }
}
