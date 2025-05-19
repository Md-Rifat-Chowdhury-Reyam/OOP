package Object;

public class CloneMethod implements Cloneable{

    String name = "Rifat";

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException    {

        CloneMethod cm = new CloneMethod();
        System.out.println(cm.name);

        CloneMethod cmClone =  (CloneMethod) cm.clone();
        System.out.println(cmClone.name);
    }


}
