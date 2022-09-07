import javax.sound.sampled.SourceDataLine;

class A{
      // int a = 7;

      void me(){
         System.out.println("this is superclass");
      }

      
   }

class B extends A{
   int a = 9;
   // void display(){                              
   //    System.out.println(a);     //Here we use 'super' for access variable of superclass from subclass.
   //    System.out.println(super.a);
   // }

   void display(){
      super.me();
       System.out.println("This is subclass");
   }


}

public class Super {
   public static void main(String[] args) {
      B ri = new B();
      ri.display();
   }
}
