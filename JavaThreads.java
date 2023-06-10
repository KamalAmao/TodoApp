public class JavaThreads extends Thread {
    //extends
    // public void run(){
    //     System.out.println("This code is running in a thread");
    // }
    // public static void main(String[]args){
    //     JavaThreads thread = new JavaThreads();
    //     thread.start();
    //     System.out.println("This code is outside of the thread");
    // }

    // implements
    // public void run(){
    //     System.out.println("The code is running in a thread");
    // }
    // public static void main(String[]args){
    //     JavaThreads myThread = new JavaThreads();
    //     Thread thread = new Thread(myThread);
    //     thread.start();
    //     System.out.println("The code is outside of the thread");
    // }

    // Concurrency Problems
    // public void run(){
    //     amount++;
    // }
    // public static int amount = 0;
    // public static void main(String[]args){
    //     JavaThreads myThread = new JavaThreads();
    //     myThread.start();
    //     System.out.println(amount);
    //     amount++;
    //     System.out.println(amount);
    // }

    //to avoid concurrency problem
    public void run(){
        amount++;
    }
    public static int  amount = 0;
    public static void main(String[]args){
        JavaThreads thread = new JavaThreads();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()){
            System.out.println("waiting...");
        }
        // Update amount and print its value
        System.out.println("JavaThreads " +amount);
        amount++;
        System.out.println("JavaThreads " + amount);

    }
}
