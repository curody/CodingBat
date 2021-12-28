package main.com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
  /**
   * Loop over the given array of strings to build a result string like this:
   *  when a string appears the 2nd, 4th, 6th, etc. time in the array, append
   *  the string to the result. Return the empty string if no string appears a
   *  2nd time.
   * 
   * @param strings Array of strings.
   * @return String array with duplicates appended accordingly.
   */
  public static String wordAppend(String[] strings) {
    String res = new String();
    Map<String, Integer> stringCount = new HashMap<String, Integer>();
    for (String s : strings) {
      stringCount.put(s, stringCount.containsKey(s) ? stringCount.get(s) + 1 : 1);
      int count = stringCount.get(s);
      if (count > 1 && (count & 1) == 0) res = res.concat(s);
    }
    
    return res;
  }
  
}
