package main.com.codingbat.string2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DoubleChar {
  /**
   * Given a string, return a string where for every char in the original,
   *  there are two chars.
   * 
   * @param str Original string.
   * @return Original string with each character doubled.
   */
  public static String doubleChar(String str) {
    return Arrays.asList(str.split("")).stream()
      .map(n -> n + n)
      .collect(Collectors.joining(""));
  }
  
}
