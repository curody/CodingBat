package main.com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
  /**
   * Given a list of strings, return a list where each string has "y" added at
   *  its end, omitting any resulting strings that contain "yy" as a substring
   *  anywhere.
   * 
   * @param strings List of strings.
   * @return List of strings appended with "y" and omitting those with "yy".
   */
  public static List<String> noYY(List<String> strings) {
    return strings.stream()
      .map(n -> n.concat("y"))
      .filter(n -> !n.contains("yy"))
      .collect(Collectors.toList());
  }
  
}
