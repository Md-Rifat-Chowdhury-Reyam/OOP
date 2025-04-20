package Basic;

public class toStringPerson {

    String name;
    toStringPerson(String n)
    {
        this.name = n;

    }

    @Override
    public  String toString()
    {
        return "person {name : '" + name + "'} ";
    }

    public static void main(String[] args) {
        toStringPerson t = new toStringPerson(" Rifat ");

        System.out.println(t.getClass());
        System.out.println(t.toString());
        System.out.println(t.hashCode());

    }
}
