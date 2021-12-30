package main.com.codingbat.string2;

import java.util.HashMap;
import java.util.Map;

public class CountHi {
  /**
   * Return the number of times that the string "hi" appears anywhere in the
   *  given string.
   * 
   * @param str String of characters.
   * @return Count of "hi" substrings.
   */
  public static int countHi(String str) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String s : new String[] { "hi" }) {
      map.put(s, 0);
      for (int i=0; i < str.length() - s.length()+1; i++) {
        if (str.substring(i, i+s.length()).equals(s)) {
          map.put(s, map.get(s) + 1);
        }
      }
    }
    return map.get("hi");
  }
  
}
