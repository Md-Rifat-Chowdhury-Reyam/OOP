package NestedClass.Inner.Annonymous;

public class GUI {
    public static void main(String[] args) {

        //Using Anonymous Inner class that define inside
                // argument
                // Here constructor argument
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("child");

            }
        });

        t.start();
        System.out.println("Main");
    }
}
