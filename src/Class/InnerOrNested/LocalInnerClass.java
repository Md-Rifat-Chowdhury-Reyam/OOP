package Class.InnerOrNested;

public class LocalInnerClass { //outer class

    int i ;
    int j;
    void getValue(int a, int b)
    {
        this.i = a;
        this.j = b;

        int sum = i + j;
        System.out.println("sum : " + sum);

        //Method Local Inner class
        class InnerCal
        {
            public InnerCal()
            {
                System.out.println("the variable i = " + i);
            }

        }
        InnerCal incl = new InnerCal();

    }

    class LocalNestedClass
    {
        void display()
        {
            System.out.println("I am nested class ");
        }

    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        lic.getValue(3,4);

        LocalInnerClass.LocalNestedClass lnc = lic.new LocalNestedClass();
        lnc.display();

    }
}
