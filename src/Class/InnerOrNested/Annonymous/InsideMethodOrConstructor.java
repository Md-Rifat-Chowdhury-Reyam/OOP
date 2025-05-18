package Class.InnerOrNested.Annonymous;

public class InsideMethodOrConstructor {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("i am runnable");
            }
        });

        t.start();
        System.out.println("main thread");
    }
}
