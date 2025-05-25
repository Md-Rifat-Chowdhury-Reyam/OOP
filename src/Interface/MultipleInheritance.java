package Interface;

public class MultipleInheritance implements addable,subable {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        int a = m.add(5,3);
        int b = m.sub(66,44);

        System.out.println("sum : " + a + " sub : " +b);
    }
}

interface addable
{
    //abstract method
    int  add(int a, int b);
}

interface subable{
    int sub(int a, int b);
}