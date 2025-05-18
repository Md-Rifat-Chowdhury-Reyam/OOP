package Class.InnerOrNested.Annonymous;

public class InsideMethodOrConstructor {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
