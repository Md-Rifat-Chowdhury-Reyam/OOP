package Generic;

public class MultipleTypeParameter < A, B > {

    A dataA;
    B dataB;

    public MultipleTypeParameter(A varA, B varB) //constructor
    {
        this.dataA = varA;
        this.dataB = varB;

        System.out.println("Data of A  " + varA + "  Data of B " + varB);
    }

    public static void main(String[] args) {
        MultipleTypeParameter < String, Integer > objt = new MultipleTypeParameter<String, Integer>("Hi I am rifat and my roll number is ", 20 );

    }

}
