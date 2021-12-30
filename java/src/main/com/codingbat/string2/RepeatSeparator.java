package main.com.codingbat.string2;

import java.util.Collections;
import java.util.stream.Collectors;

public class RepeatSeparator {
  public static String repeatSeparator(String word, String sep, int count) {
    return count == 0 ? "" : word.concat(
        Collections.nCopies(count-1, sep.concat(word))
        .stream()
        .collect(Collectors.joining()));
  }
}
