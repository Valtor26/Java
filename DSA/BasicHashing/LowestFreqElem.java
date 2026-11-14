package DSA.BasicHashing;

import java.util.HashMap;
import java.util.Scanner;

class Solution{
    public int findLowOcc(int nums[]){
        if(nums.length == 0) return -1;
        
        int lowFreq = 0;
        int answer = nums[0];

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int val : nums){
            int currFreq = freq.getOrDefault(val, 0) + 1;

            freq.put(val, currFreq);

            if(currFreq < lowFreq || (currFreq == lowFreq && val < answer)){
                answer = val;
                lowFreq = currFreq;
            }
        }

        return answer;
    }
}

public class LowestFreqElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();

        System.out.println(s.findLowOcc(nums));

        sc.close();
    }
}