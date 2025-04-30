package Class.Constructor;

public class CopyConstructor2 {

    String name;
    int id;

    CopyConstructor2(String n , int i)
    {
        this.name = n;
        this.id = i;
    }
    CopyConstructor2 (CopyConstructor2 cc)
    {
        name = cc.name;
        id = cc.id;
    }

    public static void main(String[] args) {
        CopyConstructor2 ob1 = new CopyConstructor2("Rifat", 1);

        System.out.println("Parameterized constructor : " +ob1.name + " id : " + ob1.id);

        CopyConstructor2 ob2 = new CopyConstructor2("Reyam", 2);
        System.out.println("Copy constructor : " + ob2.name);
    }
}
