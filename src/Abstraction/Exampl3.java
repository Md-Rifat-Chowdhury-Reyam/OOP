package Abstraction;

/**
 * Abstract Class having constructor, data member, and methods
 * Elements abstract class can have:
 * data member
 * abstract method
 * method body (non-abstract method)
 * constructor
 * main() method.
 */

abstract class Course
{
    Course() //constructor
    {
        System.out.println("I am abstract constructor :");
    }

    abstract void coursrList(); //abstract method that can't have body

    void displayFees(int amount) //non-abstract method that can have body
    {
        System.out.println("This course fees " + amount);
    }

}

class CSE  extends Course
{
    @Override
    void coursrList() {
        System.out.println("couse list : java, cnn, PHP, c++");
    }

    @Override
    void displayFees(int amount) {
        super.displayFees(amount);
    }
}

public class Exampl3 {

    public static void main(String[] args) {
        Course cs = new CSE();
        cs.coursrList();
        cs.displayFees(765);
    }
}
