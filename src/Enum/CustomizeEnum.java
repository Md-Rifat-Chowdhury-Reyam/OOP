package Enum;

enum TrafficLight
{
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

    private String action;
    //get

    public String getAction() {
        return this.action;
    }

    private TrafficLight(String acn)
    {
        this.action = acn;
    }
}

public class CustomizeEnum {

    public static void main(String[] args) {
        TrafficLight[] tl = TrafficLight.values();
        for(TrafficLight t : tl)
        {
            System.out.println("Traffic signal : " + t.name() + " means " + t.getAction());
        }
    }
}
