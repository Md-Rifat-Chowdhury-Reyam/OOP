package Class.Intro;

public class Calculate {

    public Calculate()
    {
        System.out.println("I am Explicit default constructor");
    }
}

class Sum extends Calculate {
    public void sum(int a1, int b1) {

        System.out.println("Sum : " + (a1 + b1));
    }
}

class Main
{
    public static void main(String[] args) {

        Sum sm = new Sum();
        sm.sum(2,3);
    }
}