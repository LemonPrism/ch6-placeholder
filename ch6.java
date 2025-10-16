

public class ch6
{
   public static void main ( String []args){
      String msg = "I have a pen, I have a Apple"; 
      System.out.println(PPAP(msg)); 
   }
   public static String PPAP (String msg ){
       
       String obj1= msg.indexOf("I have a" ); 
       String obj2 = msg.indexOf("I have a" ); 
       
       
       return "Uh!"+ obj2 + obj1; 
       
       
   }
}