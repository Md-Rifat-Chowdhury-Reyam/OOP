package Interface.nested;

public class NestedInterfaceInsideInterface {
    public static void main(String[] args) {

        Parent.Nested obj;
        Child1  cObj = new Child1();
        obj = cObj;
        obj.print();
    }
}

interface Parent
{
    public interface Nested
    {
        void print();
    }
}
class Child1 implements Parent.Nested
{
    @Override
    public void print() {
        System.out.println("Nested interface");
    }
}
