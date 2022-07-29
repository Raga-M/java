package indian.bank;
public class Bank
{
    public static void main(String[] args)
    {
     System.out.println("hello"); //terminal commands (1)"javac -d . Bank.java" (2)"java indian.bank.Bank"
    }
    public void withdraw(int a)
    {
System.out.println("withdraw=" +a);
    }
     public void balance(int b,int c)
    {
System.out.println("balance=" +(b-c));
    }
    

}