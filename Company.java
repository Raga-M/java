public class Company implements Rules
 {
    public static void main(String[] args){
     Company c=new Company();
     c.onTime();
     c.salary();
      System.out.println(c.minSalary);  
    }
public void onTime(){
    System.out.println("8.30am");
}
public void salary(){
 System.out.println("20k");   
}

    
}