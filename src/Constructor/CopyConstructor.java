package Constructor;

public class CopyConstructor {
    private String name;
    private int id;

    //default constructor
    public CopyConstructor()
    {};

    //parameterized constructor
    public CopyConstructor(String n, int i)
    {
        this.name = n;
        this.id = i;
    }

    //copy constructor
    public CopyConstructor(CopyConstructor objCopy)
    {
        this.name = objCopy.name;
        this.id = objCopy.id;
    }

    public static void main(String[] args) {
        CopyConstructor cp1 = new CopyConstructor("Rifat", 3);
        System.out.println("name from parameterized constructor : " + cp1.name + " id: " + cp1.id);


        CopyConstructor cp2 = new CopyConstructor(cp1);
        System.out.println("name from copy constructor : " + cp2.name +  " id: " + cp2.id);
    }
}
