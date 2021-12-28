package main.com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
  /**
   * Given a list of integers, return a list of the integers, omitting any that
   *  are less than 0.
   * 
   * @param nums List of integers.
   * @return List of integers with negatives filtered out.
   */
  public static List<Integer> noNeg(List<Integer> nums) {
    return nums.stream()
      .filter(n -> n >= 0)
      .collect(Collectors.toList());
  }
  
}
