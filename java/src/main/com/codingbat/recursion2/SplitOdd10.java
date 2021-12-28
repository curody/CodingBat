package main.com.codingbat.recursion2;

public class SplitOdd10 {
  /**
   * Given an array of ints, is it possible to divide the ints into two groups,
   *  so that the sum of one group is a multiple of 10, and the sum of the
   *  other group is odd. Every int must be in one group or the other. Write a
   *  recursive helper method that takes whatever arguments you like, and make
   *  the initial call to your recursive helper from splitOdd10(). (No loops
   *  needed.)
   * 
   * @param nums Array of integers.
   * @return Whether the array can be split into two groups per the constraints.
   */
  public static boolean splitOdd10(int[] nums) {
    int sumNums = sum(nums);
    if (sumNums < 1 || (sumNums & 1) == 0) return false;
    return groupSum(nums, sumNums);
  }
  
  public static boolean groupSum(int[] nums, int sumNums) {
    return groupSum(0, nums, sumNums, 0);
  }
  
  public static boolean groupSum(int start, int[] nums, int sumNums, int sum) {
    if (start >= nums.length) return validateOdd10(sum, sumNums-sum);
    return groupSum(start+1, nums, sumNums, sum)
      ||  groupSum(start+1, nums, sumNums, sum + nums[start]);
  }
  
  public static boolean validateOdd10(int a, int b) {
    return (a & 1) == 1 && (b & 1) == 0 && b % 5 == 0 
      || (b & 1) == 1 && (a & 1) == 0 && a % 5 == 0;
  }
  
  public static int sum(int[] nums) {
    return sum(0, nums, 0);
  }
  
  public static int sum(int start, int[] nums, int acc) {
    return start >= nums.length ? acc : sum(start+1, nums, acc+nums[start]);
  }
}
