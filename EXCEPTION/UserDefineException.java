package EXCEPTION;

class MyException extends Exception {
    void ageCal(int age) throws Exception{
        //or create constructor
        //MyException(int age) {
        if(age<18){
            try {
             throw new Exception("Age not valid...");   
            } catch (Exception e) {
               e.printStackTrace();
            }
        }else {
            System.out.println("Check in...");
        }
    }
}
public class UserDefineException {
    public static void main(String[] args) throws Exception {
        MyException me = MyException();
        me.ageCal(20);
    }

    

}
