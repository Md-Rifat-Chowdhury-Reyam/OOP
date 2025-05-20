package Object.DeOrSerialization;

import java.io.*;

public class DeSerialized {  //Serialization is a mechanism of converting the state of an object into a  byte stream.
    //De-serialization is a technique of reading an object from the saved state in a file.
    // Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.

    public static void main(String[] args) throws IOException, Exception {

        Person2 pr2 = new Person2("Rifat", 3);

        //first serialization then can de serialization

        //serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("NewFile.ser"));
        oos.writeObject(pr2);
        oos.close();

        //deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NewFile.ser"));

        Person2 pr = (Person2) ois.readObject();
        ois.close();

        System.out.println("output is  " + pr);
        System.out.println("Values : " + pr.name + " & " + pr.id);


    }
}

class Person2 implements Serializable
{
    String name;
    int id;

    Person2(String n, int i)
    {
        this.name = n;
        this.id = i;
    }
}