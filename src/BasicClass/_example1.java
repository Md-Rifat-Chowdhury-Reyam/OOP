package BasicClass;

public class _example1 {

    public static void main(String[] args) {

        demo d = new demo();
        d.setA(10);
        d.setB(2);
        d.calculate();
    }
}

class demo
{
    private int a ;
    private  int b ;

    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }

    public void setA(int value)
    {
        this.a = value;

    }
    public void setB(int value)
    {
        this.b = value;

    }

    public void calculate()
    {
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println(sum +" "+ sub + " " + mul + " " + div);
    }
}
