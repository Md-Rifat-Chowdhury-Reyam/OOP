package Enum;

//Enum  Declaration inside the class
public class Example1 {

    //According to Java naming conventions,
    // it is recommended that we name constant with all capital letters
    enum Days{
        SAT,
        SUN,
        MON;

        // Enum constructor called separately for each
        // constant
        private Days() //constructor can't be public or protected
        {
            System.out.println("week days : " + this.toString());
        }
    }


    public static void main(String[] args) {

        Days d = Days.MON;
        System.out.println(d);

        Color c = Color.RED;
        System.out.println(c);


    }
}

//Enum  Declaration outside the class
enum Color { //enum act as a class data type

    // inside the enum should be a list of constants According to Java naming conventions,
    // it is recommended that we name constant with all capital letters
    RED,
    GREEN,
    BLUE;
}

