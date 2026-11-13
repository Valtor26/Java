package DSA.BasicHashing;

import java.util.*;

class Solution{
    public int getOccurrence(int nums[]){
        int n = nums.length;

        if(n == 0) return -1;

        HashMap<Integer,Integer> freq = new HashMap<>();

        int answer = nums[0];
        int maxFreq = 0;

        for(int val : nums){
            int currFreq = freq.getOrDefault(val, 0) + 1;
            
            freq.put(val, currFreq);

            if(currFreq > maxFreq || currFreq == maxFreq && val < answer){
                maxFreq = currFreq;
                answer = val;
            }
        }

        return answer;
    }
}

public class HighestOccElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();

        System.out.println(s.getOccurrence(nums));

        sc.close();
    }
}