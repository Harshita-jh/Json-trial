package EXCEPTION;
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            System.out.println(6/0);
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        //this is parent class of Exception so it should written in the last catch
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Inside the finally block");
        }
    }
}
