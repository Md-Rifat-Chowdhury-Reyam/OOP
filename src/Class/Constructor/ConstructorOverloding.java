package Class.Constructor;

public class ConstructorOverloding {

    ConstructorOverloding() // default constructor
    {
        System.out.println("No Info");
    }

    ConstructorOverloding(String name )
    {
        System.out.println("NID holder name :" + name);
    }

    ConstructorOverloding(String name, int id)
    {
        System.out.println("NID holder name " +name + " id : "+ id);
    }

    public static void main(String[] args) {
        ConstructorOverloding co = new ConstructorOverloding();

        ConstructorOverloding co1 = new ConstructorOverloding("Rifat");
        ConstructorOverloding co2 = new ConstructorOverloding("Rifat", 890678);
    }




}
