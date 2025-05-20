package MethodChaining;

public class Exampl1 {

    private  String name;
    private  int id;

    Exampl1()
    {
        System.out.println("Method chaining : ");

    }

    public Exampl1 setName(String n)
    {
        this.name = n;
        return this;

    }

    public Exampl1 setId(int id) {

        this.id = id;
        return this;
    }
    public void disPlay()
    {
        System.out.println("name : " + name + " id " + id);
    }


    public static void main(String[] args) {
        new Exampl1().setName("Rifat").setId(3).disPlay();

    }
}
