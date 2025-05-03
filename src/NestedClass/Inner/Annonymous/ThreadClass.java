package NestedClass.Inner.Annonymous;

public class ThreadClass {

    public static void main(String[] args) {
        //Using Anonymous Inner class that extends a class
        // Here a Thread class

        Thread tc = new Thread()
        {
          public void run()
          {
              System.out.println("i am child");
          }
        };

        tc.start(); // Starting the thread
        System.out.println("Main thread");



    }
}
