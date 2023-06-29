package EXCEPTION;
/**
 * NestedTryCatchFinally
 */
public class NestedTryCatchFinally {

    public static void main(String[] args) {
        try {
            try{
                System.out.println(6/0);
            }
            finally{
                System.out.println("Finally Block inside Try");
            }
        }catch(Exception e){
            System.out.println("Catch Block");
            try {
                System.out.println("Try inside catch");
            } catch (Exception ex) {
                System.out.println("Catch inside catch");
            }
        }
    }
}