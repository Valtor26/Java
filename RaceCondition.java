/*
    Race condition occurs when two or more threads access shared data simultaneously, and at least one of the threads modifies the shared data.


    without .join() method, the main thread will continue executing the code without waiting for the other thread (t1 and t2) to finish its execution.
    .join() method is used to wait for the other thread to finish its execution.


    synchronized keyword is used to synchronize the shared data access.
    synchronized methods are used to ensure that only one thread can access the shared data at a time.

    
*/



class Counter{
    int count;

    public synchronized void increment(){
        count++;
    }
}


public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for(int i=0;i<1000;i++){
                c.increment();
            }
        };
          
        Runnable obj2 = () -> {
            for(int i=0;i<1000;i++){
                c.increment();
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join(); // tell the main thread to wait for the t1 thread to finish
        t2.join(); // tell the main thread to wait for the t2 thread to finish


        System.out.println(c.count);
    }
}

