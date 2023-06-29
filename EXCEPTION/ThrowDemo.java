package EXCEPTION;

public class ThrowDemo {
    static void calcAge(int age) throws Exception{
        if(age<18) {
            throw new Exception("Age not valid");
        }else { 
            System.out.println("Check in ...");
        }
    } 
    public static void main(String[] args) throws Exception  {
            int age = 12;
            // try {
            //     ThrowDemo.calcAge(age);    
            // } catch (Exception e) {
            //     e.printStackTrace();
            // }
            //or below with throws in main() method
            ThrowDemo.calcAge(age);  
    }
}
