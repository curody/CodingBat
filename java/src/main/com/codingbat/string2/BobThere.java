package main.com.codingbat.string2;

public class BobThere {
  /**
   * Return true if the given string contains a "bob" string, but where the
   *  middle 'o' char can be any char.
   * 
   * @param str String of characters.
   * @return Whether string contains "b*b" where '*' is any character.
   */
  public static boolean bobThere(String str) {
    String s = "bob";
    int sLen = s.length();
    int len = str.length();
    for (int i=0; i < len - sLen+1; i++) {
      if ((str.substring(i, i+sLen-2)
          + 'o'
          + str.substring(i+sLen-1, i+sLen))
          .equals(s)) {
            return true;
          }
    }
    return false;
  }
}
