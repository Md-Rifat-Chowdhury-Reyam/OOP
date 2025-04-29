package Class;

public class DefaultConstructor
{
    DefaultConstructor()
    {
        super();
        System.out.println("It is default constructor");
        //the use of a default constructor, which is automatically called when an object is created.
    }

    public static void main(String[] args) {
        DefaultConstructor df = new DefaultConstructor();
    }
}
