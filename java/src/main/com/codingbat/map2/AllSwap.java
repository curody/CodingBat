package main.com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class AllSwap {
  /**
   * We'll say that 2 strings "match" if they are non-empty and their first
   *  chars are the same. Loop over and then return the given array of
   *  non-empty strings as follows: if a string matches an earlier string in
   *  the array, swap the 2 strings in the array. When a position in the array
   *  has been swapped, it no longer matches anything. Using a map, this can be
   *  solved making just one pass over the array. More difficult than it looks.
   * 
   * @param strings Array of strings.
   * @return Array of strings where each pair of matching strings are swapped.
   */
  public static String[] allSwap(String[] strings) {
    String[] res = strings;
    Map<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < strings.length; i++) {
      String key = strings[i].substring(0, 1);
      if (map.containsKey(key)) {
        String temp = strings[map.get(key)];
        strings[map.get(key)] = strings[i];
        strings[i] = temp;
        map.remove(key);
      }
      else {
        map.put(key, i);
      }
    }
    
    return res;
  }
  
}
