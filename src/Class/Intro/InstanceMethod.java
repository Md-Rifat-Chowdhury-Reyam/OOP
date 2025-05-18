package Class.Intro;

// Creation of Object
// Using new Instance
class InstanceMethod {

    // Declaring and initializing string
    String n = "I am Rifat";

    // Main driver method
    public static void main(String[] args) {

        // Try block to check for exceptions
        try {
            // Correcting the class name to match
            Class<?> c = Class.forName("Class.Intro.InstanceMethod"); //Class.forName("Class.Intro.InstanceMethod") → Loads the class dynamically.

            // Creating an object of the main class using reflection
            InstanceMethod o = (InstanceMethod) c.getDeclaredConstructor().newInstance();

            // Print and display
            System.out.println(o.n);
        }
        catch (ClassNotFoundException | InstantiationException |
               IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}