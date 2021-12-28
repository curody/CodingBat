package main.com.codingbat.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
  /**
   * Given a list of strings, return a list of the strings, omitting any string
   *  that contains a "z". (Note: the str.contains(x) method returns a boolean)
   * 
   * @param strings List of strings.
   * @return List of strings that do not contain a 'z'.
   */
  public static List<String> noZ(List<String> strings) {
    return strings.stream()
      .filter(s -> !s.contains("z"))
      .collect(Collectors.toList());
  }
  
}
