package BasicClass;

public class DifferentClass {

    public static void main(String[] args) {
        anotherC ac = new anotherC();
                ac.calcutate(10,5);
    }


}

class anotherC
{
    public void calcutate(int a, int b)
    {
        int sum = a + b;
        System.out.println(sum);

        int sub = a - b;
        System.out.println(sub);


    }

}
