package EXCEPTION;
final class parent{
    final void method(){
        System.out.println("Inside parent class");
    }
}
// class child extends parent {
//     // // void method(){
//     // //     System.out.println("Inside child class");
//     // }
// }
public class FinalFinallyFinalize {
    protected void finalize() {
        System.out.println("Finalize method calling...");
    }
    public static void main(String[] args) {
        //final variable
        // final int i=0;
        // i=i+2;

        // child ch = new child();
        // ch.method();

        FinalFinallyFinalize f = new FinalFinallyFinalize();
        f.finalize();
        try {
            System.out.println(2/0);
        }finally{
            System.out.println("Finally always execute");
        }
        //f.finalize();
    }
}
