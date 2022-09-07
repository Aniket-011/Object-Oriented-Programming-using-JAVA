class Addition{
   int a;
   int b;
    
   Addition(int a, int b){
      System.out.println(a+b);
   }
}

class Three extends Addition{
   Three(){
      super(7,5);  //Here super is use to call the super class from subclass and it is at starting
      System.out.println("Hello");  //  in subclass constructor.
      int c =9;
      System.out.println(c);
   }
}

public class Superkey {
   public static void main(String[] args) {
      Three a1 = new Three();
      Addition a2 = new Addition(5,2);
   }
   
}
