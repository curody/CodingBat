package main.com.codingbat.logic2;

import java.util.Arrays;

public class RoundSum {
  /**
   * For this problem, we'll round an int value up to the next multiple of 10
   *  if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately,
   *  round down to the previous multiple of 10 if its rightmost digit is less
   *  than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of
   *  their rounded values. To avoid code repetition, write a separate helper
   *  "public int round10(int num) {" and call it 3 times. Write the helper
   *  entirely below and at the same indent level as roundSum().
   * 
   * @param a Integer value.
   * @param b Integer value.
   * @param c Integer value.
   * @return Sum of rounded values.
   */
  public static int roundSum(int a, int b, int c) {
    return Arrays.stream(new int[] { a, b, c })
      .map(n -> roundDigit(n, 10))
      .reduce(0, Integer::sum);
  }
  
  public static int roundDigit(int n, int digit) {
    int remainder = n % digit;
    return remainder < digit/2 ? n - remainder : n - remainder + digit;
  }
}
