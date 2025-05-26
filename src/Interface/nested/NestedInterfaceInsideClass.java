package Interface.nested;

public class NestedInterfaceInsideClass {
    public static void main(String[] args) {
        Outer.InnerAble obj;
        Child ch = new Child();
        ch.print();

        //or
        obj = ch;
        obj.print();

    }
}
class Outer //parent class
{
    //The access specifier is package private but, We can assign public, protected, or private also.
    interface InnerAble //nested interface
    {
        //by default abstract method
        void print();
    }
}
class Child implements Outer.InnerAble //child class
{
    @Override
    public void print() {
        System.out.println("I override from nested interface");
    }
}
