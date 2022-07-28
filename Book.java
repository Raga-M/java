public class Book
{ String author;
   int page,price; 
    public static void main(String[] args)
    {
  Book b1=new Book();
  b1.author="abc";
  b1.page=150;
  b1.price=50;
  Book b2=new Book();
  b2.author="xy";
  b2.page=200;
  b2.price=70;
  b1.buy();
  b2.buy();
  Book.offer(); //[static belong to class][non static belong to object ]
    }
    public static void offer()   //static method
    {       
        System.out.println("30% offer");
           
    }
    public void save()
    {
          System.out.println("you save 30"); 
    }
    public void buy(){
         
      System.out.println(this.author);// [this] refer to current object of the same class. this canot use in static method
    this.save();
    }
}