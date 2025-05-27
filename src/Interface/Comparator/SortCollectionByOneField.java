package Interface.Comparator;

import java.util.*;

public class SortCollectionByOneField {
    public static void main(String[] args) {

        List<Person> stu = new ArrayList<>();
        stu.add(new Person("Rifat", 1));
        stu.add(new Person("Chowdhury", 2));
        stu.add(new Person("Reyam", 3));
        stu.add(new Person( "Mayank",22));
        stu.add(new Person("Anshul",21));
        stu.add(new Person("Solanki",45));
        stu.add(new Person("Aggarwal",10));

        Collections.sort(stu, new SortByRoll());

        System.out.println("Sorted roll number : ");

        for(int i = 0; i < stu.size(); i++)
        {
            System.out.println(stu.get(i) + " ");
        }
    }
}

class Person
{
    int roll;
    String name;

    Person(String stName, int rollNum)
    {
        this.name = stName;
        this.roll = rollNum;
    }

    @Override
    public String toString()
    {
        return "Student name : " + name + " roll : " + roll;
    }


}

class SortByRoll implements Comparator<Person>
{
    public int compare(Person a, Person b)
    {
        return a.roll - b.roll;
    }
}
