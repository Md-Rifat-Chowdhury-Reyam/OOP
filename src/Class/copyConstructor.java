package Class;

public class copyConstructor {

    String carName; // class instance data member

    public copyConstructor(String name)//parameterized constructor
    {
        this.carName = name;
    }


    copyConstructor (copyConstructor cc)// copy constructor
    {
        carName = cc.carName;
        System.out.println("copy constructor called");
    }

    @Override
    public String toString()
    {
        return "(" + carName + ")";
    }

    public static void main(String[] args) {
        copyConstructor obj = new copyConstructor("Toyota Corolla");
        copyConstructor obCopy = new copyConstructor(obj); // copy constructor called;

        //call toString()
        System.out.println(obCopy);


    }
}
