package main.com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
  /**
   * Given an array of strings, return a Map<String, Integer> containing a key
   *  for every different string in the array, and the value is that string's
   *  length.
   * 
   * @param strings Array of strings.
   * @return String-Integer map pairing each unique string with its length.
   */
  public static Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> res = new HashMap<String, Integer>();
    for (String s : strings) {
      res.put(s, s.length());
    }
    return res;
  }
  
}
