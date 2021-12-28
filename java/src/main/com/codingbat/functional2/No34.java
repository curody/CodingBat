package main.com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class No34 {
  /**
   * Given a list of strings, return a list of the strings, omitting any string
   *  length 3 or 4.
   * 
   * @param strings List of strings.
   * @return List of strings of length less than 3 or greater than 4.
   */
  public static List<String> no34(List<String> strings) {
    return strings.stream()
      .filter(n -> n.length() < 3 || 4 < n.length())
      .collect(Collectors.toList());
  }
  
}
