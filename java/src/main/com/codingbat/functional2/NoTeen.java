package main.com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
  /**
   * Given a list of integers, return a list of those numbers, omitting any
   *  that are between 13 and 19 inclusive.
   * 
   * @param nums List of integers.
   * @return List of integers that aren't in [13, 19].
   */
  public static List<Integer> noTeen(List<Integer> nums) {
    return nums.stream()
      .filter(n -> 13 > n || n > 19)
      .collect(Collectors.toList());
  }
  
}
