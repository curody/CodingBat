package main.com.codingbat.string2;

public class MixString {
  /**
   * Given two strings, a and b, create a bigger string made of the first char
   *  of a, the first char of b, the second char of a, the second char of b,
   *  and so on. Any leftover chars go at the end of the result.
   * 
   * @param a String of characters.
   * @param b String of characters.
   * @return Mixed string composed of alternating characters from a and b.
   */
  public static String mixString(String a, String b) {
    String sm = a;
    String lg = b;
    if (b.length() < a.length()) {
      sm = b;
      lg = a;
    }
    int smLen = sm.length();
    
    String res = "";
    for (int i=0; i < smLen; i++) {
      res = res.concat(a.substring(i, i+1)).concat(b.substring(i, i+1));
    }
    return smLen == lg.length() ? res : res.concat(lg.substring(smLen));
  }
  
}
