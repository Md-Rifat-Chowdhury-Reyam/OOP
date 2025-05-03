package NestedClass.Inner.Annonymous;

public class RunnableThread {
    public static void main(String[] args) {

        Runnable r = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("child");

            }
        };

        Thread t = new Thread(r);
        t.start();
        System.out.println("Main");

    }
}
