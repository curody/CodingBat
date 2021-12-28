package main.com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
  /**
   * The classic word-count algorithm: given an array of strings, return a
   *  Map<String, Integer> with a key for each different string, with the value
   *  the number of times that string appears in the array.
   * 
   * @param strings Array of strings.
   * @return Map of each word paired with their frequency.
   */
  public static Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> res = new HashMap<String, Integer>();
    for (String s : strings) {
      res.put(s, res.containsKey(s) ? res.get(s) + 1 : 1);
    }
    return res;
  }
  
}
