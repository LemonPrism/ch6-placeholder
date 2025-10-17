/*

public class ch6 {
    public static void main(String[] args) {
        String msg = "I have a pen, I have a Apple.";
        System.out.println(ppap(msg));  
    }

    public static String ppap(String msg) {
        String G = "I have a ";
        String C = ","; 
        String P= "."; 
               
       
        
        int c = msg.indexOf(C); 
        String obj1 = msg.substring (8, c ); 
        
      
        int Sc = msg.indexOf(P, c); 
        String obj2 = msg.substring (c+11, Sc );
        
        
        return "Uh! "+obj2 + obj1 ;
    }
}
*/ 
/*
public class ch6 {
    public static void main(String[] args) {
        
        String msg = "Amy, must I jujitsu my ma?";
        if (isPalindrome(msg)){
            System.out.println(msg + " is a palindrome"); 
        } else {
            System.out.println(msg + " is not a palindrome");
        }
    }    

    public static boolean isPalindrome(String str) {
        String Lstr = str.toLowerCase(); 
        String m = ""; 
        String nonLetters = ",.:;()[]{}!@#$%^&* ";
        
        if (nonLetters.contains(str)) {
            
            
            
            
        
        }



        for (int i = Lstr.length() - 1; i >= 0; i--) {
            m += Lstr.charAt(i);
        }
        if(m.equals(Lstr)){
            return true; 
        }else {
            return false; 
        
        }
    }
}

*/

public class ch6 {
    public static void main(String[] args) {
        
        int num = 124; 
        
        System.out.println( convertToBinary(num)); 
        
       
    }    

    public static String convertToBinary (int num) {
        String m = "" ; 
        
        if ( num==0){
            return "0"; 
        }
        
        for (int i = num; i > 0; i /= 2){
            m = (i%2)+m;
            
        }
        
        return m ; 
    }
}

