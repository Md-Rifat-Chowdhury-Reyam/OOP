package Abstraction;

public class ExampleWithConcreteClass {
    public static void main(String[] args) {

        Shape s1 = new Circle(3);
        System.out.println( s1.toString());
    }
}


abstract class Shape
{
    String color;
    abstract double area();
    public abstract String toString();

    public String getColor()
      {
       return color;
      }

}

class Circle extends Shape //Circle is a concrete class
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
        System.out.println("radius : " + radius);
    }

    @Override
    double area()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
            return "The circle area is : " +area();
    }
}
