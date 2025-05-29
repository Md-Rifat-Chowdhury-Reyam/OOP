package DependencyInjection;

public class SetterInjection {
    public static void main(String[] args) {
        Engine2 en = new Engine2();
        Car2 cr2 = new Car2();

        cr2.setEn(en);
        cr2.drive();

    }
}

class Engine2
{
    public void start()
    {
        System.out.println("Engine started ");
    }
}

class Car2
{
    private Engine2 en ;

    public void setEn(Engine2 en) {
        this.en = en;
    }

    public void drive()
    {
        en.start();
        System.out.println("Car is driving ");
    }
}