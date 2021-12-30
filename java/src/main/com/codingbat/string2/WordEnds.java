package main.com.codingbat.string2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordEnds {
  /**
   * Given a string and a non-empty word string, return a string made of each
   *  char just before and just after every appearance of the word in the
   *  string. Ignore cases where there is no char before or after the word, and
   *  a char may be included twice if it is between two words.
   * 
   * @param str String of characters.
   * @param word Non-empty word string.
   * @return String containing the characters immediately before and after each
   *  appearance of <code>word</code> in <code>str</code>.
   */
  public static String wordEnds(String str, String word) {
    if (str.length() == word.length()) return "";
    
    List<Character> chars = new ArrayList<Character>();
    int wordIndex = str.indexOf(word);
    while (wordIndex != -1) {
      if (wordIndex != 0) {
        chars.add(str.charAt(wordIndex - 1));
      }
      if (wordIndex != str.length() - word.length()) {
        chars.add(str.charAt(wordIndex + word.length()));
      }
      
      wordIndex = str.indexOf(word, wordIndex + 1);
    }
    
    return chars.stream()
      .map(String::valueOf)
      .collect(Collectors.joining());
  }
  
}
