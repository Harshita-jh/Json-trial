public class ThreadLambdaAnony {
    public static void main(String[] args) {
        System.out.println("Thread creation using LAmbda and Anonymous class in java");
        //know about which thread is running currently
        System.out.println(Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread);
        t.start();

        //Anonymous Class
        Runnable t2 = new Runnable() {

            @Override
            public void run() {
                System.out.println("I am Thread "+Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(t2);
        thread.start();

        //Lambda for creating Thread.
        Runnable t3 = ()->{
            System.out.println("This is creation of Thread using Lambda Exp");
        };
        Thread thread1 = new Thread(t3);
        thread1.start();
    }
}
