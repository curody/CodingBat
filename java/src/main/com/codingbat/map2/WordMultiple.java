package main.com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
  /**
   * Given an array of strings, return a Map<String, Boolean> where each
   *  different string is a key and its value is true if that string appears 2
   *  or more times in the array.
   * 
   * @param strings Array of strings.
   * @return Strings each paired with whether the string appears more than once.
   */
  public static Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> res = new HashMap<String, Boolean>();
    for (String s : strings) {
      res.put(s, res.containsKey(s));
    }
    
    return res;
  }
  
}
