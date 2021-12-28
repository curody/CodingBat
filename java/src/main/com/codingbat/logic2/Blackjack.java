package main.com.codingbat.logic2;

import java.util.Arrays;

public class Blackjack {
  /**
   * Given 2 int values greater than 0, return whichever value is nearest to 21
   *  without going over. Return 0 if they both go over.
   * 
   * @param a Integer value.
   * @param b Integer value.
   * @return Greater value that is at or below 21. 0 if both values are over.
   */
  public static int blackjack(int a, int b) {
    return Arrays.stream(new int[] { a, b })
      .filter(n -> n <= 21)
      .reduce(0, Math::max);
  }
}
