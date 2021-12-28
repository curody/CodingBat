package main.com.codingbat.logic2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LoneSum {
  /**
   * Given 3 int values, a b c, return their sum. However, if one of the values
   *  is the same as another of the values, it does not count towards the sum.
   * 
   * @param a Integer value.
   * @param b Integer value.
   * @param c Integer value.
   * @return Sum of the applicable values.
   */
  public static int loneSum(int a, int b, int c) {
    return Arrays.stream(uniques(new int[] { a, b, c }))
      .reduce(0, Integer::sum);
  }

  /**
   * Filter integer array to keep only unique values.
   * 
   * @param arr Integer array.
   * @return List of unique integer values.
   */
  public static int[] uniques(int[] arr) {
    Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    for(int i:arr) {
      map.put(i, !map.containsKey(i));
    }
    return map.entrySet().stream()
      .filter(n -> n.getValue())
      .mapToInt(n -> n.getKey())
      .toArray();
  }
}
