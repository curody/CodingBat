package main.com.codingbat.recursion2;

public class Split53 {
  /**
   * Given an array of ints, is it possible to divide the ints into two groups,
   *  so that the sum of the two groups is the same, with these constraints:
   *  all the values that are multiple of 5 must be in one group, and all the
   *  values that are a multiple of 3 (and not a multiple of 5) must be in the
   *  other. (No loops needed.)
   * 
   * @param nums Array of integers.
   * @return Whether the array can be split into two groups per the constraints.
   */
  public static boolean split53(int[] nums) {
    if (nums.length == 1) return false;
    int target = sum(nums);
    if ((target & 1) == 1) return false;
    return groupSum(nums, target >> 1);
  }
  
  public static boolean groupSum(int[] nums, int target) {
    return groupSum(0, nums, target);
  }
  
  public static boolean groupSum(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    if (nums[start] % 5 == 0) return groupSum(start+1, nums, target-nums[start]);
    if (nums[start] % 3 == 0) return groupSum(start+1, nums, target);
    return groupSum(start+1, nums, target)
      ||  groupSum(start+1, nums, target-nums[start]);
  }
  
  public static int sum(int[] nums) {
    return sum(0, nums, 0);
  }
  
  public static int sum(int start, int[] nums, int acc) {
    return start >= nums.length ? acc : sum(start+1, nums, acc+nums[start]);
  }
}
