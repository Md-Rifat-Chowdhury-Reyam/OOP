package Object.DeOrSerialization;

import java.io.*;

public class SerializationConvertion {
    //Serialization is a mechanism of converting the state of an object into a byte stream.

    public static void main(String[] args) {

        //Serialization
        Person pr =  new Person("Rifat", 2);
        String fileName = "file.ser";

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(pr);

            oos.close();
            fos.close();
            System.out.println("Object serialized : " + pr);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}

class Person implements Serializable
{
    String name;
    int id;

    Person(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
}
