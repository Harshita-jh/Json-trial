package EXCEPTION;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * TryWithResource
 */
public class TryWithResource {

    public static void main(String[] args) {
        String n;
        System.out.println("Enter anything...");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            n = br.readLine();        
            System.out.println(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}