public class Super
{ 
    public void price(int a)
    {
        System.out.println("price= "+a);
    }
    public static void main(String[] args)
    {
       Super s=new Super();
       s.price(4);
    }
}