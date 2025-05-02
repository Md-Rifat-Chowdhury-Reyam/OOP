package Class.Constructor;

public class $ConstructorClass {

    int x;
    $ConstructorClass()
    {
        this(10);
        System.out.println( "Constructor called later");
    }
    $ConstructorClass(int a)
    {
        x = a;
        System.out.println( "Constructor called"); // this parameterized constructor will print first cause
        // default constructor take time for (this 10)
    }


    public static void main(String[] args) {

        // no need to call constructor method;
        $ConstructorClass cc = new $ConstructorClass(); // $ConstructorClass() is default constructor

    }
}
