package Interface.nested;

public class ShortTec {
    interface NestedInterface
    {
        void Method();

    }

    public static void main(String[] args) {
        NestedInterface ni = new NestedInterface()
        {
            @Override
            public void Method() {
                System.out.println("I am nested");
            }
        };

        ni.Method();
    }
}
