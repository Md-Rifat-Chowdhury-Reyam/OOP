package Enum;

import java.util.EnumSet;

enum WeekDays
{

    //Create an enum for each day of a week
    MONDAY(){
        @Override
        public String getNumberOfDay() {
            return "Monday";
        }
    },
    TUESDAY(){
        @Override
        public String getNumberOfDay() {
            return "Tuesday";
        }
    },
    WEDNESDAY(){
        @Override
        public String getNumberOfDay() {
            return "Wednesday";
        }
    };

    public abstract String getNumberOfDay(); //abstract method of enum class
}


public class AbstractionInEnum {

    WeekDays w; //object of enum class

    public AbstractionInEnum(WeekDays wDay) //constructor
    {
        this.w = wDay;
    }

    public static void main(String[] args) {

        AbstractionInEnum ae = new AbstractionInEnum(WeekDays.MONDAY);
        System.out.println(ae.w.name() + " "  + ae.w.getNumberOfDay());



        //Iterating from specific range through ENUM_SET
        EnumSet<WeekDays> days = EnumSet.range(WeekDays.TUESDAY, WeekDays.WEDNESDAY);
        System.out.println("Work days in the range : ");
        for(WeekDays d : days)
        {
            System.out.println(d);
        }
    }
}
