package Class.Intro;

public class Intro {
    int a; int b;

    public void setA(int a)
    {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void sum()
    {
        System.out.println(a + b);
    }
    public void sub()
    {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Intro in = new Intro();  // implicit constructor

        in.setA(2);
        in.setB(5);

        in.sum();
        in.sub();
    }
}
