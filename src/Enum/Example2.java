package Enum;

enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
public class Example2 {

    Day d;// Example2 class that contains an object of "d"
    public Example2(Day d) //constructor
    {
        this.d = d;
    }

    public void dayLike()
    {
        switch (d)
        {
            case SATURDAY :
                System.out.println("saturday office dayoff");
                break;

            case SUNDAY:
                System.out.println("office working day");
                break;

            case MONDAY:
                System.out.println("office working day 2");
                break;

            case TUESDAY:
                System.out.println("middle of week");
                break;

            case WEDNESDAY:
                System.out.println("4th week day");
                break;

            case THURSDAY:
                System.out.println("last working day");
                break;

            case FRIDAY:
                System.out.println("off day");
                break;

            default:
                System.out.println("There is nothing else");
                break;
        }
    }

    public static void main(String[] args) {

        String str = "SATURDAY";

        Example2 ex = new Example2(Day.valueOf(str));
        ex.dayLike();
    }
}
