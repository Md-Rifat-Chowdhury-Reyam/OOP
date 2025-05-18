package Class.InnerOrNested.Annonymous;

public class ExtendsClass {
    public static void main(String[] args) {

        Thread t = new Thread()
        {
            @Override
            public void run() {
                System.out.println("Thread run : ");
            }
        };

        t.start();
        System.out.println("Main thread ");
    }
}
