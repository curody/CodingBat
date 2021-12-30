package main.com.codingbat.string2;

public class XyBalance {
  /**
   * We'll say that a String is xy-balanced if for all the 'x' chars in the
   *  string, there exists a 'y' char somewhere later in the string. So "xxy"
   *  is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return
   *  true if the given string is xy-balanced.
   * 
   * @param str String of characters.
   * @return False if 'x' appears to the right of all 'y's, else true.
   */
  public static boolean xyBalance(String str) {
    return str.lastIndexOf('y') >= str.lastIndexOf('x');
  }
}
