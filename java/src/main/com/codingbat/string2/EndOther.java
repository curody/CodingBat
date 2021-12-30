package main.com.codingbat.string2;

public class EndOther {
  /**
   * Given two strings, return true if either of the strings appears at the
   *  very end of the other string, ignoring upper/lower case differences (in
   *  other words, the computation should not be "case sensitive"). Note: str
   *  toLowerCase() returns the lowercase version of a string.
   * 
   * @param a String of characters.
   * @param b String of characters.
   * @return Whether if one string appears at the end of the other.
   */
  public static boolean endOther(String a, String b) {
    return a.length() < b.length()
      ? endsWith(b, a, false)
      : endsWith(a, b, false);
  }

  public static boolean endsWith(String a, String b) {
    return endsWith(a, b, true);
  }

  public static boolean endsWith(String a, String b, boolean caseSensitive) {
    if (a.length() < b.length()) return false;
    return caseSensitive 
      ? a.substring(a.length() - b.length()).equals(b)
      : a.substring(a.length() - b.length()).toLowerCase()
        .equals(b.toLowerCase());
  }
  
}
