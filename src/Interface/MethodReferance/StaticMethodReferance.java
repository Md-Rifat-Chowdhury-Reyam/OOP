package Interface.MethodReferance;

import java.io.*;
import java.util.*;

public class StaticMethodReferance {

    public static int compareByName(Person a, Person b)
    {
        return a.getName().compareTo(b.getName());
    }

    public static int compareByAge(Person a, Person b)
    {
        return a.getAge().compareTo(b.getAge());
    }


    public static void main(String[] args) {


        // Creating an empty ArrayList of user-defined type
        // List of person
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Rifat", 25));
        personList.add(new Person("Poonam", 26));
        personList.add(new Person("Sachin", 19));

        // Using static method reference to
        // sort array by name
        Collections.sort(personList,StaticMethodReferance ::compareByName);

        System.out.println("Sort by name : ");
        // Using streams over above object of Person type
        personList.stream().map(x -> x.getName()).forEach(System.out ::println);

        // Using static method reference to
        // sort array by age
        Collections.sort(personList, StaticMethodReferance ::compareByAge);
        System.out.println("Sort by age : ");

        // Using streams over above object of Person type
        personList.stream().map(x -> x.getAge()).forEach(System.out :: println);

    }
}

class Person
{
    private String name;
    private Integer age;

    public Person(String n, int ag)
    {
        this.name = n;
        this.age = ag;
    }

   public String getName()
   {
       return name;

   }
   public Integer getAge()
   {
       return age;
   }

}
