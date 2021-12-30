package main.com.codingbat.string2;

import java.util.HashMap;
import java.util.Map;

public class CatDog {
  /**
   * Return true if the string "cat" and "dog" appear the same number of times
   *  in the given string.
   * 
   * @param str String of characters.
   * @return Whether the substring count for "cat" matches that for "dog".
   */
  public static boolean catDog(String str) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (String s : new String[] { "cat", "dog" }) {
      map.put(s, 0);
      for (int i=0; i < str.length() - s.length()+1; i++) {
        if (str.substring(i, i+s.length()).equals(s)) {
          map.put(s, map.get(s) + 1);
        }
      }
    }
    return map.get("cat") == map.get("dog");
  }
}
