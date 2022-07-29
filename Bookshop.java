public class Bookshop{
    String bookname,author;
    int price,discount; 
    public Bookshop(String s1,String s2, int a){
       bookname=s1;
       author=s2;
       price=a;
         
    }
    public static void main(String[] args)
{
Bookshop book1=new Bookshop("c++","author1",120);
//Bookshop book2=new Bookshop("java","author2",150,10);
//Bookshop book3=new Bookshop("python",160,20);
book1.sell();
//book2.sell();
//book3.sell();
    }
    public void sell(){
 System.out.println("bookname="+bookname+"   "+"author="+author+"   "+"price="+price+" "+"discount="+discount);
    }
}