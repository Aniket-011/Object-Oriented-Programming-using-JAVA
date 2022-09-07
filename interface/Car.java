public class Car implements Engine,Brake {
    
   public void start(){ 
      System.out.println("I am in engine to start");
   }
   public void stop(){
      System.out.println("I am in engine to stop");
   }

   public void brake(){
      System.out.println("I am in brake to apply brake");
   }
}
