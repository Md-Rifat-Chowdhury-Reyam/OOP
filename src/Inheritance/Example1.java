package Inheritance;

public class Example1 {
    public static void main(String[] args) {

        /**
         * Note: During inheritance only the object of the subclass is created,
         * Snot the superclass. For more, refer to Java Object Creation of Inherited Class.
         */
        Dog d = new Dog();
        d.makeSound();
        d.eat();
    }
}

//parent class
class Animal
{
    void eat()
    {
        System.out.println("eating");
    }
    void sleep()
    {
        System.out.println("sleeping");
    }
}

//child class
class Dog extends Animal
{
    void makeSound()
    {
        System.out.println(getClass().getName() + " Barking");
    }
}