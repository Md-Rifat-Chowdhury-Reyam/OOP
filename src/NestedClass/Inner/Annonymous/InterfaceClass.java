package NestedClass.Inner.Annonymous;

public interface InterfaceClass {
    int a = 30;
    void ageM();

}

class Ann implements InterfaceClass
{
    @Override
    public void ageM()
    {
        System.out.println("Age from annonymous "+ a);
    }

    public static void main(String[] args) {
        Ann an = new Ann();
        an.ageM();
    }

}

