package test.com.codingbat;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized.Parameter;

import main.com.codingbat.logic2.Blackjack;
import main.com.codingbat.logic2.CloseFar;
import main.com.codingbat.logic2.EvenlySpaced;
import main.com.codingbat.logic2.LoneSum;
import main.com.codingbat.logic2.LuckySum;
import main.com.codingbat.logic2.MakeBricks;
import main.com.codingbat.logic2.MakeChocolate;
import main.com.codingbat.logic2.NoTeenSum;
import main.com.codingbat.logic2.RoundSum;

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
    "20, 4, 39, true",
  })
  public void MakeBricksTest(int small, int big, int goal, boolean expected) {
    var actual = MakeBricks.makeBricks(small, big, goal);
    assertEquals(expected, actual);
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
    "1, 3, 1, 3",
  })
  public void LoneSumTest(int a, int b, int c, int expected) {
    var actual = LoneSum.loneSum(a, b, c);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @CsvSource({
    "1, 2, 3, 6",
    "1, 2, 13, 3",
    "1, 13, 3, 1",
    "1, 13, 13, 1",
    "6, 5, 2, 13",
    "13, 2, 3, 0",
    "13, 2, 13, 0",
    "13, 13, 2, 0",
    "9, 4, 13, 13",
    "8, 13, 2, 8",
    "7, 2, 1, 10",
    "3, 3, 13, 6",
  })
  public void LuckySumTest(int a, int b, int c, int expected) {
    var actual = LuckySum.luckySum(a, b, c);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @CsvSource({
    "1, 2, 3, 6",
    "2, 13, 1, 3",
    "2, 1, 14, 3",
    "2, 1, 15, 18",
    "2, 1, 16, 19",
    "2, 1, 17, 3",
    "17, 1, 2, 3",
    "2, 15, 2, 19",
    "16, 17, 18, 16",
    "17, 18, 19, 0",
    "15, 16, 1, 32",
    "15, 15, 19, 30",
    "15, 19, 16, 31",
    "5, 17, 18, 5",
    "17, 18, 16, 16",
    "17, 19, 18, 0",
  })
  public void NoTeenSumTest(int a, int b, int c, int expected) {
    var actual = NoTeenSum.noTeenSum(a, b, c);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @CsvSource({
    "16, 17, 18, 60",
    "12, 13, 14, 30",
    "6, 4, 4, 10",
    "4, 6, 5, 20",
    "4, 4, 6, 10",
    "9, 4, 4, 10",
    "0, 0, 1, 0",
    "0, 9, 0, 10",
    "10, 10, 19, 40",
    "20, 30, 40, 90",
    "45, 21, 30, 100",
    "23, 11, 26, 60",
    "23, 24, 25, 70",
    "25, 24, 25, 80",
    "23, 24, 29, 70",
    "11, 24, 36, 70",
    "24, 36, 32, 90",
    "14, 12, 26, 50",
    "12, 10, 24, 40",
  })
  public void RoundSumTest(int a, int b, int c, int expected) {
    var actual = RoundSum.roundSum(a, b, c);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @CsvSource({
    "1, 2, 10, true",
    "1, 2, 3, false",
    "4, 1, 3, true",
    "4, 5, 3, false",
    "4, 3, 5, false",
    "-1, 10, 0, true",
    "0, -1, 10, true",
    "10, 10, 8, true",
    "10, 8, 9, false",
    "8, 9, 10, false",
    "8, 9, 7, false",
    "8, 6, 9, true",
  })
  public void CloseFarTest(int a, int b, int c, boolean expected) {
    var actual = CloseFar.closeFar(a, b, c);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @CsvSource({
    "19, 21, 21",
    "21, 19, 21",
    "19, 22, 19",
    "22, 19, 19",
    "22, 50, 0",
    "22, 22, 0",
    "33, 1, 1",
    "1, 2, 2",
    "34, 33, 0",
    "17, 19, 19",
    "18, 17, 18",
    "16, 23, 16",
    "3, 4, 4",
    "3, 2, 3",
    "21, 20, 21",
  })
  public void BlackjackTest(int a, int b, int expected) {
    var actual = Blackjack.blackjack(a, b);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @CsvSource({
    "2, 4, 6, true",
    "4, 6, 2, true",
    "4, 6, 3, false",
    "6, 2, 4, true",
    "6, 2, 8, false",
    "2, 2, 2, true",
    "2, 2, 3, false",
    "9, 10, 11, true",
    "10, 9, 11, true",
    "10, 9, 9, false",
    "2, 4, 4, false",
    "2, 2, 4, false",
    "3, 6, 12, false",
    "12, 3, 6, false",
  })
  public void EvenlySpacedTest(int a, int b, int c, boolean expected) {
    var actual = EvenlySpaced.evenlySpaced(a, b, c);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @CsvSource({
    "4, 1, 9, 4",
    "4, 1, 10, -1",
    "4, 1, 7, 2",
    "6, 2, 7, 2",
    "4, 1, 5, 0",
    "4, 1, 4, 4",
    "5, 4, 9, 4",
    "9, 3, 18, 3",
    "3, 1, 9, -1",
    "1, 2, 7, -1",
    "1, 2, 6, 1",
    "1, 2, 5, 0",
    "6, 1, 10, 5",
    "6, 1, 11, 6",
    "6, 1, 12, -1",
    "6, 1, 13, -1",
    "6, 2, 10, 0",
    "6, 2, 11, 1",
    "6, 2, 12, 2",
    "60, 100, 550, 50",
    "1000, 1000000, 5000006, 6",
    "7, 1, 12, 7",
    "7, 1, 13, -1",
    "7, 2, 13, 3",
  })
  public void MakeChocolateTest(int small, int big, int goal, int expected) {
    var actual = MakeChocolate.makeChocolate(small, big, goal);
    assertEquals(expected, actual);
  }
}
