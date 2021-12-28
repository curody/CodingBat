package main.com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
  /**
   * Given a list of non-negative integers, return a list of those numbers
   *  multiplied by 2, omitting any of the resulting numbers that end in 2.
   * 
   * @param nums List of integers.
   * @return List of doubled integers omitting numbers ending in 2.
   */
  public static List<Integer> two2(List<Integer> nums) {
    return nums.stream()
      .map(n -> n * 2)
      .filter(n -> n % 10 != 2)
      .collect(Collectors.toList());
  }
  
}
