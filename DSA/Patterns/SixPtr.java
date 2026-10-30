package DSA.Patterns;

import java.util.Scanner;

public class SixPtr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
