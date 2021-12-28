package main.com.codingbat.logic2;

public class LuckySum {
  /**
   * Given 3 int values, a b c, return their sum. However, if one of the values
   *  is 13 then it does not count towards the sum and values to its right do
   *  not count. So for example, if b is 13, then both b and c do not count.
   * 
   * @param a Integer value.
   * @param b Integer value.
   * @param c Integer value.
   * @return Sum of the applicable values.
   */
  public static int luckySum(int a, int b, int c) {
    int sum = 0;
    int[] vals = new int[] { a, b, c };
    for (int i:vals) {
      if (i == 13) break;
      sum += i;
    }
    return sum;
  }
  
}
