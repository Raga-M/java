import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("enter the name");
        String a;
        int b;
        double c;
          a=ip.nextLine();
         System.out.println("enter the age");

          b=ip.nextInt();
          System.out.println("enter the salary");
          c=ip.nextDouble();
         System.out.println("your name "+a);
         System.out.println("your age "+b);
          System.out.println("your salary "+c);
    }

}