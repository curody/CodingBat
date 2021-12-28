package main.com.codingbat.logic2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LoneSum {
  /**
   * Given 3 int values, a b c, return their sum. However, if one of the values
   *  is the same as another of the values, it does not count towards the sum.
   * 
   * @param a Integer value.
   * @param b Integer value.
   * @param c Integer value.
   * @return  Sum of the applicable values.
   */
  public static int loneSum(int a, int b, int c) {
    return (uniques(new int[] { a, b, c })).stream()
      .reduce(0, Integer::sum);
  }

  public static List<Integer> uniques(int[] arr) {
    Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    for(int i:arr) {
      map.put(i, !map.containsKey(i));
    }
    return map.entrySet().stream()
      .filter(n -> n.getValue())
      .map(n -> n.getKey())
      .collect(Collectors.toList());
  }
}
