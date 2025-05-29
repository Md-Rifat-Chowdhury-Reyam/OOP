package DependencyInjection;

public class InterfaceInjection {
    public static void main(String[] args) {

        Engine3 en = new Engine3();
        Car3 c = new Car3();

        c.injectEngine(en);
        c.drive();
    }
}

class Engine3
{
    public void Start()
    {
        System.out.println("Engine started ");
    }
}
interface EngineInjection
{
    public void injectEngine(Engine3 engine );
}

class Car3 implements EngineInjection
{
    private Engine3 engine;

    @Override
    public void injectEngine(Engine3 engine) {
        this.engine = engine;
    }

    public void drive()
    {
        engine.Start();
        System.out.println("Car id driving ");
    }
}
