package Interface.MethodReferance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ConstructorMethodReferace {


    //static <T> == method based generic;
    public static <T>  List <T> objList (int length, Supplier <T> objSupplier)
    {
        List<T> tList = new ArrayList<>();

        for(int i = 0; i < length; i++)
        {
            tList.add(objSupplier.get());

        }
        return tList;

    }
    public static void main(String[] args) {


        List<Student> studentList = objList(5, Student::new);
        studentList.stream().map(x -> x.getName()).forEach(System.out :: println);
    }
}

class Student
{
    private String name;
    private Integer id;

    Student()
    {
        Random rndm = new Random();

        // Assigning a random value
        // to name
        this.name = rndm.ints(97, 122 +1).limit(5)
                .collect(StringBuilder :: new, StringBuilder ::appendCodePoint, StringBuilder :: append)
                .toString();

    }

    public String getName()
    {
        return name;
    }

    public Integer getId() {
        return id;
    }
}

