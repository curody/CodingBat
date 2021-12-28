package main.com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
  /**
   * Given an array of non-empty strings, create and return a
   *  Map<String, String> as follows: for each string add its first character
   *  as a key with its last character as the value.
   * 
   * @param strings Array of strings.
   * @return Map of each string's first character paired with their last.
   */
  public static Map<String, String> Pairs(String[] strings) {
    Map<String, String> res = new HashMap<String, String>();
    for (String s : strings) {
      res.put(s.substring(0, 1), s.substring(s.length()-1, s.length()));
    }
    return res;
  }
}
