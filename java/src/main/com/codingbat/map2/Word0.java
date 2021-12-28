package main.com.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

public class Word0 {
  public static Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> res = new HashMap<String, Integer>();
    for (String str : strings) {
      res.put(str, 0);
    }
    return res;
  }  
}