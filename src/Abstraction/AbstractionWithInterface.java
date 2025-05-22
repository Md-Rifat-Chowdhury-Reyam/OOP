package Abstraction;

public class AbstractionWithInterface {
    public static void main(String[] args) {

        AbstractionInterface af = new Circle1(3);
        System.out.println("The area of circle " + af.area());
    }
}

interface AbstractionInterface
{
    double area(); //abstract method
}

class Circle1 implements AbstractionInterface
{
    double radius;

    Circle1(double r)
    {
        this.radius = r;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }

}