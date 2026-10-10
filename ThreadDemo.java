/*
    Threads are used to execute multiple tasks simultaneously.
    A thread is a lightweight process that can be scheduled to run independently of other threads.
    Threads are used to perform tasks in parallel, which can improve the performance of an application.


    The run() method is the entry point of a thread.
    The start() method is used to start/create a new thread.
    The join() method is used to wait for a thread to finish its execution.

    thread scheduling is based on the operating system's scheduler. A thread gets a time slice to execute and then the OS decides which thread gets to run next.


    .getPriority() method is used to get the priority of a thread.

    .setPriority() method is used to set the priority of a thread, the priority can be between 1 and 10. Higher priority does not guarantee earlier execution. The scheduler may favor a higher-priority thread, but you cannot rely on it running first or finishing first.

    
Thread.MIN_PRIORITY  -->	1	--> Lowest priority
Thread.NORM_PRIORITY -->	5	--> Normal priority
Thread.MAX_PRIORITY	 -->    10	--> Highest priority


*/

class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class ThreadDemo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println("Before Threads");
        obj1.start();
        obj2.start();
        System.out.println("After Threads");
    }
}
