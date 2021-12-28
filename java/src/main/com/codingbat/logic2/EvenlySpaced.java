package main.com.codingbat.logic2;

public class EvenlySpaced {
  /**
   * Given three ints, a b c, one of them is small, one is medium and one is
   *  large. Return true if the three values are evenly spaced, so the
   *  difference between small and medium is the same as the difference between
   *  medium and large.
   * 
   * @param a Integer value.
   * @param b Integer value.
   * @param c Integer value.
   * @return True if all values are evenly spaced, otherwise false.
   */
  public static boolean evenlySpaced(int a, int b, int c) {
    int[] d = new int[] { Math.abs(a-b), Math.abs(a-c), Math.abs(b-c) };
    return d[0] == d[1] && d[0]+d[1] == d[2]
        || d[0] == d[2] && d[0]+d[2] == d[1]
        || d[1] == d[2] && d[1]+d[2] == d[0];
  }
}
