package Inheritance;

public class Hybrid {
    public static void main(String[] args) {

        //Moon is the subclass of both Earth and Sun class --> represent multiple inheritance
        Moon mn = new Moon();
        mn.round();

        Sun s = new Sun();
        Earth e = new Earth();
        Mars m = new Mars();

        // instanceof is a keyword used for checking
        // if a reference variable contains a given type of object reference or not.

        System.out.println(mn instanceof Sun);
        System.out.println(mn instanceof Earth);
    }
}

class Sun
{
    void light()
    {
        System.out.println("I am from sun ray");
    }
}
class Earth extends Sun
{
    void lightFall()
    {
        System.out.println("Light falling from sun");
    }
}
class Mars extends Sun
{
    void lightM()
    {
        System.out.println("Light from Sun");
    }
}
class Moon extends Earth
{
    void round()
    {
        System.out.println("round around Earth");
    }
}
