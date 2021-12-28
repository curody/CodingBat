package main.com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
  /**
   * Given a list of strings, return a list of the strings, omitting any string
   *  length 4 or more.
   * 
   * @param strings List of strings.
   * @return List of strings of length less than 4.
   */
  public static List<String> noLong(List<String> strings) {
    return strings.stream()
      .filter(n -> n.length() < 4)
      .collect(Collectors.toList());
  }
  
}
