package EXCEPTION;
import java.io.BufferedReader;
import java.io.FileReader;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            FileReader fr =  new FileReader("abc.txt");
            BufferedReader bf = new BufferedReader(fr);
            bf.read();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                //BufferedReader bf;
                //bf.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }    
}
