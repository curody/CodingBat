package main.com.codingbat.logic2;

public class CloseFar {
  /**
   * Given three ints, a b c, return true if one of b or c is "close"
   *  (differing from a by at most 1), while the other is "far", differing from
   *  both other values by 2 or more. Note: Math.abs(num) computes the absolute
   *  value of a number.
   * 
   * @param a Integer value.
   * @param b Integer value.
   * @param c Integer value.
   * @return True if two values are "close" and the other is "far", else false.
   */
  public static boolean closeFar(int a, int b, int c) {
    if (Math.abs(b-c) > 1) {
      if (Math.abs(a-b) < 2 && Math.abs(a-c) > 1) return true;
      if (Math.abs(a-c) < 2 && Math.abs(a-b) > 1) return true;
    }
    return false;
  }
  
}
