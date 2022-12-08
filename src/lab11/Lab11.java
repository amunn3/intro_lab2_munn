package lab11;

import java.util.Scanner;

public class Lab11 {
   
   public static int fibonacci(int n) {
      if (n < 0) {
         return -1;
      }
      if (n == 0 || n == 1) {
         return n;
      }
      int[] nums = new int[n+1];
      nums[0] = 0;
      nums[1] = 1;
      
      for (int i = 2; i <= n; i++) {
         nums[i] = nums[i-1] + nums[i-2];
      }
      
      return nums[n];
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}