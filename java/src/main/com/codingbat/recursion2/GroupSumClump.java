package main.com.codingbat.recursion2;

public class GroupSumClump {
  /**
   * Given an array of ints, is it possible to choose a group of some of the
   *  ints, such that the group sums to the given target, with this additional
   *  constraint: if there are numbers in the array that are adjacent and the
   *  identical value, they must either all be chosen, or none of them chosen.
   *  For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in
   *  the middle must be chosen or not, all as a group. (one loop can be used
   *  to find the extent of the identical values).
   * 
   * @param start   Initial array index.
   * @param nums    Array of integers.
   * @param target  Target sum integer.
   * @return Whether target sum can be reached given the constraints.
   */
  public static boolean groupSumClump(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    int count = clumpCount(start+1, nums, nums[start], 1);
    return groupSumClump(start + count, nums, target - count*nums[start])
      ||  groupSumClump(start + count, nums, target);
  }
  
  private static int clumpCount(int start, int[] nums, int prev, int count) {
    if (start >= nums.length || nums[start] != prev) return count;
    return clumpCount(start+1, nums, nums[start], count+1);
  }
  
}
