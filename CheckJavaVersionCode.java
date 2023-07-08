
public class CheckJavaVersionCode {
    public static void main(String[] args) {
        System.out.println("Hello World...!");
        System.out.println("Current JVM version - " + System.getProperty("java.version"));
        
        //For above java 8 version use below class
        //System.out.println("Current JVM version - " + Runtime.version());
    }
}
