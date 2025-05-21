package Constructor;

/**
 * When we want certain common resources to be executed with every constructor
 * we can put the code in the init block.
 * Init block is always executed before any constructor,
 * whenever a constructor is used for creating a new object.
 */

public class BlockWithConstructor {
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
