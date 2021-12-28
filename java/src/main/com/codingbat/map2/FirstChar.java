package main.com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
  /**
   * Given an array of non-empty strings, return a Map<String, String> with a
   *  key for every different first character seen, with the value of all the
   *  strings starting with that character appended together in the order they
   *  appear in the array.
   * 
   * @param strings Array of non-empty strings.
   * @return
   */
  public static Map<String, String> firstChar(String[] strings) {
    Map<String, String> res = new HashMap<String, String>();
    for (String s : strings) {
      String key = s.substring(0, 1);
      res.put(key, res.containsKey(key) ? res.get(key).concat(s) : s);
    }
    return res;
  }
  
}
