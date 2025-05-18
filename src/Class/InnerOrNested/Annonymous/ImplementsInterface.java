package Class.InnerOrNested.Annonymous;

public class ImplementsInterface {

    public static void main(String[] args) {

        Runnable rn = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Runnable ");
            }
        };

        Thread t = new Thread(rn);
        t.start();
        System.out.println("Main thread");
    }
}
