package DSA.BasicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
    public int findSecOcc(int nums[]){
        if(nums.length == 0) return -1;

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int val : nums){
            if(!freq.containsKey(val)){
                freq.put(val, 1);
            }
            else{
                freq.put(val, freq.get(val) + 1);
            }
        }

        boolean hasHighest = false;
        boolean hasSecond = false;
        int highestElem = 0;
        int highestFreq = 0;
        int secondElem = 0;
        int secondFreq = 0;

        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            int currentElem = entry.getKey();
            int currentFreq = entry.getValue();

            if(!hasHighest){
                highestElem = currentElem;
                highestFreq = currentFreq;

                hasHighest = true;
            }
            else if(currentFreq > highestFreq){
                secondElem = highestElem;
                secondFreq = highestFreq;
                hasSecond = true;

                highestElem = currentElem;
                highestFreq = currentFreq;
            }
            else if(currentFreq == highestFreq){
                if(currentElem < highestElem){
                    highestElem = currentElem;
                }
            }
            else {
                if(!hasSecond || currentFreq > secondFreq || (currentFreq == secondFreq && currentElem < secondElem)){
                    secondElem = currentElem;
                    secondFreq = currentFreq;
                    hasSecond = true;
                }
            }
        }
        if(!hasSecond) return -1;

        return secondElem;
    }
}

public class SecondHighOccElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();

        System.out.println(s.findSecOcc(nums));

        sc.close();
    }
}