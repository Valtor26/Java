/*
    In Java, a Parallel Stream processes elements using multiple threads, allowing different elements to be processed concurrently. It's useful when a task can be divided into independent pieces of work.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for(int i=0;i<size;i++){
            nums.add(ran.nextInt(100));
        }

        // int result1 = nums.parallelStream()
        //         .map(n -> n*2)
        //         .reduce(0,(c,e)-> c+e);

        long startSeq = System.currentTimeMillis();
        int result2 = nums.stream()
                      .map(i -> i*2)
                      .mapToInt(i -> i) 
                      .sum();
        long endSeq = System.currentTimeMillis();



        long startPar = System.currentTimeMillis();
        int result3 = nums.parallelStream()
                      .map(i -> i*2)
                      .mapToInt(i -> i) 
                      .sum();
        
        long endPar = System.currentTimeMillis();

        System.out.println(result2 + " " + result3);
        System.out.println("Sequential execution time: " + (endSeq - startSeq) + " milliseconds");
        System.out.println("Parallel execution time: " + (endPar - startPar) + " milliseconds");
        
    }
}
