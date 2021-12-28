package main.com.codingbat.recursion2;

public class SplitArray {
  /**
   * Given an array of ints, is it possible to divide the ints into two groups,
   *  so that the sums of the two groups are the same. Every int must be in one
   *  group or the other. Write a recursive helper method that takes whatever
   *  arguments you like, and make the initial call to your recursive helper
   *  from splitArray(). (No loops needed.)
   * 
   * @param nums Array of integers.
   * @return Whether the array can be split into two equal sums.
   */
  public static boolean splitArray(int[] nums) {
    if (nums.length == 1) return false;
    int target = sum(nums);
    if (target % 2 == 1) return false;
    return groupSum(nums, target/2);
  }
  
  public static boolean groupSum(int[] nums, int target) {
    return groupSum(0, nums, target);
  }
  
  public static boolean groupSum(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    return groupSum(start+1, nums, target-nums[start])
      ||  groupSum(start+1, nums, target);
  }
  
  public static int sum(int[] nums) {
    return sum(0, nums, 0);
  }
  
  public static int sum(int start, int[] nums, int acc) {
    return start >= nums.length ? acc : sum(start+1, nums, acc+nums[start]);
  }
}
