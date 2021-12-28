package main.com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class No9 {
  /**
   * Given a list of non-negative integers, return a list of those numbers
   *  except omitting any that end with 9. (Note: % by 10)
   * 
   * @param nums List of integers.
   * @return List of integers with those ending with 9 omitted.
   */
  public static List<Integer> no9(List<Integer> nums) {
    return nums.stream()
      .filter(n -> n % 10 != 9)
      .collect(Collectors.toList());
  }
  
}
