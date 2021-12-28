package main.com.codingbat.logic2;

import java.util.Arrays;

public class NoTeenSum {
  /**
   * Given 3 int values, a b c, return their sum. However, if any of the values
   *  is a teen -- in the range 13..19 inclusive -- then that value counts as
   *  0, except 15 and 16 do not count as a teens. Write a separate helper
   *  "public int fixTeen(int n) {"that takes in an int value and returns that
   *  value fixed for the teen rule. In this way, you avoid repeating the teen
   *  code 3 times (i.e. "decomposition"). Define the helper below and at the
   *  same indent level as the main noTeenSum().
   * 
   * @param a Integer value.
   * @param b Integer value.
   * @param c Integer value.
   * @return Sum of applicable values.
   */
  public static int noTeenSum(int a, int b, int c) {
    return Arrays.stream(new int[] { a, b, c })
      .filter(n -> n < 13 || n > 19 || n == 15 || n == 16)
      .reduce(0, Integer::sum);
  }
}
