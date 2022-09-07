public class Main {
   public static void main(String[] args) {
      Child ch1 = new Child();  //Constructor with no argument will do work.
      Child ch2 = new Child(5);  // Constructor with single argument will do work.
      
      Child ch6 = new Child(2,4);  //here we assign two argument to variable.
      System.out.println(ch6.age);
      System.out.println(ch6.roll);
      System.out.println("\n"); 
   

      System.out.println(ch1.age);
      System.out.println("\n"); 

      System.out.println(ch2.age);  //This willl work on basis on argumernt both have same argument.
      System.out.println(ch2.roll);
      System.out.println("\n");

      InherChil ch3 = new InherChil(); // Constructor for children class.
      System.out.println(ch3.seatNo); //Here seatno access from child class InherChil 
      System.out.println(ch3.age);      // and other data taken from parent class Child. 
      System.out.println(ch3.roll);

      Child ch4 = new InherChil(); //here class name and are different but even we print o/p
      System.out.println(ch4.age);  //This is done to element which is defined in super(parent) class.
                                    // and here we not able to assign argument.

   }
   
}
