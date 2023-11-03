import java.util.*;

public class NonThreadSafeExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fifth");
        list.add("Sixth");
        list.add("Seven");
        list.add("First");
        list.add("First");
        list.add("First");
        list.add("First");

        //using Runnable interface
        /* Runnable t = new Runnable() {

            @Override
            public void run() {
              
            } */
            
            Runnable t1 = () -> {
                //thread 1 - task
                for(String str : list) {
                    System.out.println(str);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            Runnable t2 = () -> {
                //thread 2 - task
                list.add("New item");
                list.add("New item");
                list.add("New item");
            };

            new Thread(t2).start();
            new Thread(t1).start();
        }

    }
