package Constructor;

/**
 * When we want certain common resources to be executed with every constructor
 * we can put the code in the init block.
 * Init block is always executed before any constructor,
 * whenever a constructor is used for creating a new object.
 * There are 3 areas where we can use the initializer blocks:
 *
 * Constructors
 * Methods
 * Blocks
 */

public class BlockWithConstructor {

    //instance initializer block (IIB)
    {
        int sum = 4 + 5;
        System.out.println( sum);
    }

    // Static block
    static
    {
        // Print statement
        System.out.print(
                "Static block can be printed without main method");
    }

    BlockWithConstructor()
    {
        System.out.println("I am deafult");
    }

    //it is a common block  to print
    {
        System.out.println("Initializer block"); //initializing block
    }

    BlockWithConstructor(int i , int j)
    {
        System.out.println(i + "  " + j);
    }

    public static void main(String[] args) {
     new BlockWithConstructor();
       new BlockWithConstructor(3,4);
    }

    
}
