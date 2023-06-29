package EXCEPTION;

public class ThrowsDemo {
    void calc() throws ArithmeticException {
         System.out.println(2/0);
    }
    public static void main(String[] args){
       ThrowsDemo td = new ThrowsDemo();
       td.calc();
    }
}
