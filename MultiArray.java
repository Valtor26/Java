public class MultiArray{
    public static void main(StringDemo args[]){
        int nums[][] = new int [3][4];

         // generate a random number between 0 and 100

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random() * 10); // assign the random number to each element of the array
            }
        }

        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){
        //         System.out.print(nums[i][j] + " "); // print each element of the array
        //     }
        //     System.out.println(); // move to the next line after each row
        // }

        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " "); // print each element of the array
            }
            System.out.println(); // move to the next line after each row
        }


        int threeD[][][] = new int [3][4][5];
        for(int i=0;i<threeD.length;i++){
            for(int j=0;j<threeD[i].length;j++){
                for(int k=0;k<threeD[i][j].length;k++){
                    threeD[i][j][k] = (int)(Math.random() * 10); // assign the random number to each element of the array
                }
            }
        }

        for(int n[][] : threeD){
            for(int m[] : n){
                for(int l : m){
                    System.out.print(l + " "); // print each element of the array
                }
                System.out.println(); // move to the next line after each row
            }
            System.out.println(); // move to the next line after each 2D array
        }
    }
}