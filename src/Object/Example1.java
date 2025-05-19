package Object;

public class Example1 {
    //Instance variable

    String name;
    int id;

    public Example1(String n, int id)
    {
        this.name = n;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return ("Name is " + this.getName() + " id is : " + this.getId());
    }

    public static void main(String[] args) {
        Example1 obj = new Example1("Rifat", 54);
        System.out.println(obj.toString());
    }
}
