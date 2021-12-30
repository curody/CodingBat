package main.com.codingbat.string2;

public class XyzThere {
  /**
   * Return true if the given string contains an appearance of "xyz" where the
   *  xyz is not directly preceeded by a period (.). So "xxyz" counts but
   *  "x.xyz" does not.
   * 
   * @param str String of characters.
   * @return Whether "xyz" substring exists outside of any possible ".xyz"s.
   */
  public static boolean xyzThere(String str) {
    boolean periodFound = false;
    String s = "xyz";
    int sLen = s.length();
    for (int i=0; i < str.length() - sLen+1; i++) {
      if (str.charAt(i) == '.') periodFound = true;
      else if (periodFound) {
        if (!str.substring(i, i+sLen).equals(s) ) periodFound = false;
      }
      else if (str.substring(i, i+sLen).equals(s)) return true;
    }
    return false;
  }
  
}
