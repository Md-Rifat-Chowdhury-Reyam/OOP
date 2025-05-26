package Interface.marker;

import java.io.*;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableInterface
{
    public static void main(String[] args)
     {

        try {
            Info1 in1 = new Info1(2, "Md. Rifat Chowdhury");

            String filePath = "Hello.txt";

            // Serialization
            FileOutputStream fos = new FileOutputStream(filePath);  // Using .ser extension for serialized files
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(in1);
            oos.close();


            // Deserialization
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Info1 in2 = (Info1) ois.readObject();
            ois.close();


            System.out.println(in2.a + "  " + in2.name);
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
     }
}

class Info1 implements Serializable {
    //for serialization
    private static final long serialVersionUID = 1L;  // Add serialVersionUID

    int a;
    String name;
    public Info1(int i , String ourName)
    {
        this.a = i;
        this.name = ourName;
    }
}
