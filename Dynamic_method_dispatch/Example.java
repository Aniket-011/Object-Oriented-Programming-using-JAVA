import javax.sql.rowset.spi.SyncResolver;

class Phone{
   public  void on(){
         System.out.println("keep on the phone");
      }
}
 class Smartphone extends Phone{
   public  void on(){
      System.out.println("keep on the smart phone");
   }
   public void off(){
      System.out.println("Keep off  smart phone");
   }
}


public class Example{
   public static void main(String[] args) {
      // Phone obj = new Phone();
      // Smartphone obj2 = new Smartphone();
       
      // obj.on();
      // obj2.off();

      Phone obj = new Smartphone();  // i.e. known as dynamic method dispatch where we can give reference variable of superclass and object of subclass.

      obj.on();  
      // obj.off();

   }
   
}



