package Interface.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollectionMoreThanOne {
    public static void main(String[] args) {

        List<PersonMany> personList = new ArrayList<>();

        personList.add(new PersonMany("Ajay", 27));
        personList.add(new PersonMany("Sneha", 23));
        personList.add(new PersonMany("Simran", 37));
        personList.add(new PersonMany("Ankit", 22));
        personList.add(new PersonMany("Anshul", 29));
        personList.add(new PersonMany("Sneha", 22));

        Collections.sort(personList, new SortMore());
        System.out.println("Sort by name and roll :" );

        for(PersonMany i : personList)
        {
            System.out.println(i);
        }
    }
}

class PersonMany
{
    String personName;
    int id;

    PersonMany(String name, int id)
    {
        this.personName = name;
        this.id = id;
    }
    public String getPersonName()
    {
        return personName;
    }
    public Integer getId()
    {
        return id;
    }

    @Override
    public String toString()
    {
        return "Student name : " + personName + " id : " + id;
    }
}

class SortMore implements Comparator<PersonMany>
{
    @Override
    public int compare(PersonMany obj1, PersonMany obj2) {

       //compare by name
        int comName = obj1.getPersonName().compareTo(obj2.getPersonName());

        //compare by id
        int comId = obj1.getId().compareTo(obj2.getId());

        //return with ternary operator
        return (comName == 0 ) ? comId : comName;
    }
}
