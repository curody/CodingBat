package main.com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class Word0 {
  /**
   * Given an array of strings, return a Map<String, Integer> containing a key
   *  for every different string in the array, always with the value 0. For
   *  example the string "hello" makes the pair "hello":0. We'll do more
   *  complicated counting later, but for this problem the value is simply 0.
   * @param strings Array of strings.
   * @return String-Integer map with 0 value attached for each unique string.
   */
  public static Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> res = new HashMap<String, Integer>();
    for (String str : strings) {
      res.put(str, 0);
    }
    return res;
  }  
}