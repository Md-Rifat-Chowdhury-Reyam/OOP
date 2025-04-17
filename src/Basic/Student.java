package Basic;

public class Student {
    public   int id;
    public String name;

    public void InfoS(int ids, String name)
    {
        this.id = ids;
        this.name = name;

        System.out.println("Id " + ids + " Name " +name);
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.InfoS(1, "Rifat");

        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);

    }
}
