public class Main {
   
      public static void main(String[] args) {
         New s1 =  new New(20,"aniket",false);
         New s2 =  new New(25,"abhishek",false);
   
         System.out.println(s1.age);
         System.out.println(s1.name);
         System.out.println(s1.married);
         System.out.println(s1.cname);
            // both s1 and s2 represting the same cname variable because it is static and 
            // depend on object.
         System.out.println(s2.age);
         System.out.println(s2.name);
         System.out.println(s2.married);
         System.out.println(s2.cname);
       
      }
   
   }

