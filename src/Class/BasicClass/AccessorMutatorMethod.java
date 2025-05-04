package Class.BasicClass;

public class AccessorMutatorMethod {

    private int balance = 100;

    public int getBalance()
    {
        return balance;

    }
    public void setBalance(int a)
    {
        balance = balance + a;
    }

    public static void main(String[] args) {
        AccessorMutatorMethod am =  new AccessorMutatorMethod();
        am.setBalance(50);
        System.out.println("balance " + am.getBalance());
    }

}
