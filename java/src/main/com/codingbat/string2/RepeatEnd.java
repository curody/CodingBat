package main.com.codingbat.string2;

import java.util.Collections;
import java.util.stream.Collectors;

public class RepeatEnd {
  /**
   * Given a string and an int n, return a string made of n repetitions of the
   *  last n characters of the string. You may assume that n is between 0 and
   *  the length of the string, inclusive.
   * 
   * @param str String of characters.
   * @param n Number of characters to draw from the end of the string as well
   *  as the number of times to repeat said characters.
   * @return Original string with last <code>n</code> characters appended
   *  <code>n</code> times.
   */
  public static String repeatEnd(String str, int n) {
    return Collections.nCopies(n, str.substring(str.length()-n))
      .stream()
      .collect(Collectors.joining());
  }
}
