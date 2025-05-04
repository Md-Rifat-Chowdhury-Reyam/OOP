package Class.BasicClass;

public class InstanceMethod {


    public void disPlay()
    {
        int i = 20;
        System.out.println("this is from instance method " + i);
    }

    public static void main(String[] args) {
        InstanceMethod im = new InstanceMethod();
        im.disPlay();
        System.out.println("Rifat");
    }

}
