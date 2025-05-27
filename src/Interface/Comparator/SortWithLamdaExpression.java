package Interface.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortWithLamdaExpression {
    public static void main(String[] args) {

        List<PersonLamda> personList = new ArrayList<>();

        personList.add(new PersonLamda("Ajay", 27));
        personList.add(new PersonLamda("Sneha", 23));
        personList.add(new PersonLamda("Simran", 37));
        personList.add(new PersonLamda("Ankit", 22));

        //lamda expression
        personList.sort(Comparator.comparing(PersonLamda::getPersonName).thenComparing(PersonLamda::getId));

        for (PersonLamda i : personList)
        {
            System.out.println(i);
        }
    }
}

class PersonLamda {
    String personName;
    int id;

    PersonLamda(String name, int id) {
        this.personName = name;
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student name : " + personName + " id : " + id;
    }
}