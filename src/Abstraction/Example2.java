package Abstraction;


abstract class Student
{
    abstract void info();
}


public class Example2 extends Student {

    @Override
    void info()
    {
        String name = "Rifat";
        int id = 2 ;

        System.out.println("Student name : " + name + " " + "and id : " + id);
    }

    public static void main(String[] args) {
        Student st = new Example2();
        st.info();
    }
}


