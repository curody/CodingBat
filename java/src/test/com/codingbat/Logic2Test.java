package test.com.codingbat;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.com.codingbat.logic2.LoneSum;
import main.com.codingbat.logic2.MakeBricks;

public class Logic2Test {
  @ParameterizedTest
  @CsvSource({
    "3, 1, 8, true",
    "3, 1, 9, false",
    "3, 2, 10, true",
    "3, 2, 8, true",
    "3, 2, 9, false",
    "6, 1, 11, true",
    "6, 0, 11, false",
    "1, 4, 11, true",
    "0, 3, 10, true",
    "1, 4, 12, false",
    "3, 1, 7, true",
    "1, 1, 7, false",
    "2, 1, 7, true",
    "7, 1, 11, true",
    "7, 1, 8, true",
    "7, 1, 13, false",
    "43, 1, 46, true",
    "40, 1, 46, false",
    "40, 2, 47, true",
    "40, 2, 50, true",
    "40, 2, 52, false",
    "22, 2, 33, false",
    "0, 2, 10, true",
    "1000000, 1000, 1000100, true",
    "2, 1000000, 100003, false",
    "20, 0, 19, true",
    "20, 0, 21, false",
    "20, 4, 51, false",
    "20, 4, 39, true"
  })
  public void MakeBricksTest(int small, int big, int goal, boolean expected) {
    var result = MakeBricks.makeBricks(small, big, goal);
    assertEquals(expected, result);
  }

  @ParameterizedTest
  @CsvSource({
    "1, 2, 3, 6",
    "3, 2, 3, 2",
    "3, 3, 3, 0",
    "9, 2, 2, 9",
    "2, 2, 9, 9",
    "2, 9, 2, 9",
    "2, 9, 3, 14",
    "4, 2, 3, 9",
    "1, 3, 1, 3"
  })
  public void LoneSumTest(int a, int b, int c, int expected) {
    var result = LoneSum.loneSum(a, b, c);
    assertEquals(expected, result);
  }
}
