package Generic;

//use < > to specify Parameter type
public class Example1 < Ex > {

    Ex variable;

    public Example1(Ex var) //parameterized constructor
    {
        this.variable = var;
    }

    public Ex getVariable() { //return type Ex
        return this.variable;
    }

    public static void main(String[] args) {

        //instance of Integer type
        Example1<Integer> exObj = new Example1<Integer>(20);
        System.out.println(exObj.getVariable());

        //instance of String type
        Example1<String>exStr = new Example1<String>("I am Rifat");
        System.out.println(exStr.getVariable());
    }

}

