package EXCEPTION;
/**
 * DemoException
 */
public class DemoException {

    public static void main(String[] args) {
     /* System.out.println("1");
     System.out.println("2");
     //System.out.println(6/0);
     System.out.println("4");
     System.out.println("5");
     try {
       System.out.println(6/0); 
     } catch (Exception e) {
        e.printStackTrace();
     }   */
     System.out.println("1");
     System.out.println("2");
    
     
     try {
       System.out.println(6/0); 
       System.out.println("4");
     } finally{
        
        System.out.println("5");
     } 
    }
}