package NestedClass;


//outer class
public class StaticNestedOuterClass
{

    String name = "Rifat";
    static  int id = 1;
    private String locatioN = "Rangpur";

    //nested class
    static class StaticNestedClass
    {
        void disPlay()
        {
            StaticNestedOuterClass nc = new StaticNestedOuterClass();
            System.out.println("the name from nested class : " + nc.name );

            System.out.println("In nested class : " + id );

            System.out.println("the location from nested class : " + nc.locatioN);


        }

    }

    public static void main(String[] args) {
        StaticNestedOuterClass.StaticNestedClass nc = new StaticNestedOuterClass.StaticNestedClass();

        nc.disPlay();
    }
}
