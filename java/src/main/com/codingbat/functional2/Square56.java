package main.com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
  /**
   * Given a list of integers, return a list of those numbers squared and the
   *  product added to 10, omitting any of the resulting numbers that end in 5
   *  or 6.
   * 
   * @param nums List of integers.
   * @return List of integers each squared plus 10, less those ending in 5 or 6.
   */
  public static List<Integer> square56(List<Integer> nums) {
    return nums.stream()
      .map(n -> n * n + 10)
      .filter(n -> n % 10 != 5 && n % 10 != 6)
      .collect(Collectors.toList());
  }
  
}
