package Interface.marker;

public class CloneableInterface {
    public static void main(String[] args) throws CloneNotSupportedException{

        ParentClass pc = new ParentClass(20);

        // down-casting as clone() return type is Object
        ParentClass pc2 = (ParentClass) pc.clone();
        System.out.println(pc2.i);

    }
}
class ParentClass implements Cloneable
{
    int i;
    ParentClass(int a)
    {
        this.i = a;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}