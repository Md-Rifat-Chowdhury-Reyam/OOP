package Interface;

public class AbstractInterface {
    public static void main(String[] args) {

        User u = new User();
        u.address();
        u.account(12345);
    }
}

interface MajorFunctionAble
{
    void deposit();
    void withdraw();
    void account(int acc);
}

abstract class InfoUser implements MajorFunctionAble
{
    abstract void address();

    public void account(int acc)
    {
        System.out.println("Account number is : " + acc);
    }
}

class User extends InfoUser
{
    @Override
    void address() {
        System.out.println("User  name : Rifat " + "\nHome town : Rangpur ");
    }



    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }
}
