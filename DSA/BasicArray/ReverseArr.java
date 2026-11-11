package DSA.BasicArray;

class Solution{
    public int[] rev(int arr[]){
        int n = arr.length;

        if(n <= 1) return arr;
        int j = n-1;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j--;
        }
        return arr;
    }
}

public class ReverseArr {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,5,6};

        Solution s = new Solution();

        int nums[] = s.rev(arr);
        
        for(int el : nums){
            System.out.print(el + " ");
        }
    }
}
