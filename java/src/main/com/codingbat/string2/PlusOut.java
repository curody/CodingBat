package main.com.codingbat.string2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PlusOut {
  public static String plusOut(String str, String word) {
    String safeWord = "\\Q" + word + "\\E"; // safe-ish
    String res = Arrays.stream(str.split(safeWord))
      .map(s -> s.replaceAll(".", "+"))
      .collect(Collectors.joining(word));
    return res.length() == str.length() ? res : res.concat(word);
  }
  
}
