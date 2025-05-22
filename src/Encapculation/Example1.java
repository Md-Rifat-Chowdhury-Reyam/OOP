package Encapculation;
//Encapsulation can be achieved by declaring all the variables in a class as private
// and writing public methods in the class to set and get the values of the variables.

public class Example1 {
    private String name;
    private int roll;

    public String getName()
    {
        return name;
    }
    public int getRoll()
    {
        return roll;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setRoll(int roll)
    {
        this.roll = roll;
    }

    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.setName("Rifat");
        e1.setRoll(4);

        System.out.println("Name : " + e1.getName() + " roll : " +e1.getRoll() );
    }
}
