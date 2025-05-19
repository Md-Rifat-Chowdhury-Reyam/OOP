package Object;

public class ArbitaryObject {
    public static void main(String[] args) {

        // Creating instances of different classes
        String name = "Rifat";
        Integer i = 5;

        // Method accepting an arbitrary object
        printArbitaryObject(name);// Passing a String object
        printArbitaryObject(i);// Passing an Integer object


    }

    public static void printArbitaryObject(Object obj)
    {
        System.out.println("Arbitary Object : " + obj);
    }
}
