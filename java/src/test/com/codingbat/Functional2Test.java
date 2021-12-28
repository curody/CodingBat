package test.com.codingbat;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import main.com.codingbat.functional2.No34;
import main.com.codingbat.functional2.No9;
import main.com.codingbat.functional2.NoLong;
import main.com.codingbat.functional2.NoNeg;
import main.com.codingbat.functional2.NoTeen;
import main.com.codingbat.functional2.NoYY;
import main.com.codingbat.functional2.NoZ;

public class Functional2Test {
  static Stream<Arguments> NoNegTestSource() {
    return Stream.of(
      Arguments.of(Arrays.asList(1, -2), Arrays.asList(1) ),
      Arguments.of(Arrays.asList(-3, -3, 3, 3), Arrays.asList(3, 3) ),
      Arguments.of(Arrays.asList(-1, -1, -1), Arrays.asList() ),
      Arguments.of(Arrays.asList(), Arrays.asList() ),
      Arguments.of(Arrays.asList(0, 1, 2), Arrays.asList(0, 1, 2) ),
      Arguments.of(Arrays.asList(3, -10, 1, -1, 4, -400), Arrays.asList(3, 1, 4) ),
      Arguments.of(Arrays.asList(-1, 3, 1, -1, -10, -100, -111, 5), Arrays.asList(3, 1, 5) )
    );
  }

  @ParameterizedTest
  @MethodSource("NoNegTestSource")
  public void NoNegTest(List<Integer> nums, List<Integer> expected) {
    var actual = NoNeg.noNeg(nums);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> No9TestSource() {
    return Stream.of(
      Arguments.of(Arrays.asList(1, 2, 19), Arrays.asList(1, 2) ),
      Arguments.of(Arrays.asList(9, 19, 29, 3), Arrays.asList(3) ),
      Arguments.of(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3) ),
      Arguments.of(Arrays.asList(45, 99, 90, 28, 13, 999, 0), Arrays.asList(45, 90, 28, 13, 0) ),
      Arguments.of(Arrays.asList(), Arrays.asList() ),
      Arguments.of(Arrays.asList(9), Arrays.asList() ),
      Arguments.of(Arrays.asList(0, 9, 0), Arrays.asList(0, 0) )
    );
  }

  @ParameterizedTest
  @MethodSource("No9TestSource")
  public void No9Test(List<Integer> nums, List<Integer> expected) {
    var actual = No9.no9(nums);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> NoTeenTestSource() {
    return Stream.of(
      Arguments.of(Arrays.asList(12, 13, 19, 20), Arrays.asList(12, 20) ),
      Arguments.of(Arrays.asList(1, 14, 1), Arrays.asList(1, 1) ),
      Arguments.of(Arrays.asList(15), Arrays.asList() ),
      Arguments.of(Arrays.asList(-15), Arrays.asList(-15) ),
      Arguments.of(Arrays.asList(), Arrays.asList() ),
      Arguments.of(Arrays.asList(0, 1, 2, -3), Arrays.asList(0, 1, 2, -3) ),
      Arguments.of(Arrays.asList(15, 17, 19, 21, 19), Arrays.asList(21) ),
      Arguments.of(Arrays.asList(-16, 2, 15, 3, 16, 25), Arrays.asList(-16, 2, 3, 25) )
    );
  }

  @ParameterizedTest
  @MethodSource("NoTeenTestSource")
  public void NoTeenTest(List<Integer> nums, List<Integer> expected) {
    var actual = NoTeen.noTeen(nums);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> NoZTestSource() {
    return Stream.of(
      Arguments.of(Arrays.asList("aaa", "bbb", "aza"), Arrays.asList("aaa", "bbb") ),
      Arguments.of(Arrays.asList("hziz", "hzello", "hi"), Arrays.asList("hi") ),
      Arguments.of(Arrays.asList("hello", "howz", "are", "youz"), Arrays.asList("hello", "are") ),
      Arguments.of(Arrays.asList(), Arrays.asList() ),
      Arguments.of(Arrays.asList(""), Arrays.asList("") ),
      Arguments.of(Arrays.asList("x", "y", "z"), Arrays.asList("x", "y") )
    );
  }

  @ParameterizedTest
  @MethodSource("NoZTestSource")
  public void NoZTest(List<String> nums, List<String> expected) {
    var actual = NoZ.noZ(nums);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> NoLongTestSource() {
    return Stream.of(
      Arguments.of(Arrays.asList("this", "not", "too", "long"), Arrays.asList("not", "too") ),
      Arguments.of(Arrays.asList("a", "bbb", "cccc"), Arrays.asList("a", "bbb") ),
      Arguments.of(Arrays.asList("cccc", "cccc", "cccc"), Arrays.asList() ),
      Arguments.of(Arrays.asList(), Arrays.asList() ),
      Arguments.of(Arrays.asList(""), Arrays.asList("") ),
      Arguments.of(Arrays.asList("empty", "", "empty"), Arrays.asList("") ),
      Arguments.of(Arrays.asList("a"), Arrays.asList("a") ),
      Arguments.of(Arrays.asList("aaaa", "bbb", "***", "333"), Arrays.asList("bbb", "***", "333") )
    );
  }

  @ParameterizedTest
  @MethodSource("NoLongTestSource")
  public void NoLongTest(List<String> nums, List<String> expected) {
    var actual = NoLong.noLong(nums);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> No34TestSource() {
    return Stream.of(
      Arguments.of(Arrays.asList("a", "bb", "ccc"), Arrays.asList("a", "bb") ),
      Arguments.of(Arrays.asList("a", "bb", "ccc", "dddd"), Arrays.asList("a", "bb") ),
      Arguments.of(Arrays.asList("ccc", "dddd", "apple"), Arrays.asList("apple") ),
      Arguments.of(Arrays.asList("this", "not", "too", "long"), Arrays.asList() ),
      Arguments.of(Arrays.asList("a", "bbb", "cccc", "xx"), Arrays.asList("a", "xx") ),
      Arguments.of(Arrays.asList("dddd", "ddd", "xxxxxxx"), Arrays.asList("xxxxxxx") ),
      Arguments.of(Arrays.asList(), Arrays.asList() ),
      Arguments.of(Arrays.asList(""), Arrays.asList("") ),
      Arguments.of(Arrays.asList("empty", "", "empty"), Arrays.asList("empty", "", "empty") ),
      Arguments.of(Arrays.asList("a"), Arrays.asList("a") ),
      Arguments.of(Arrays.asList("aaaa", "bbb", "*****", "333"), Arrays.asList("*****") )
    );
  }

  @ParameterizedTest
  @MethodSource("No34TestSource")
  public void No34Test(List<String> nums, List<String> expected) {
    var actual = No34.no34(nums);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> NoYYTestSource() {
    return Stream.of(
      Arguments.of(Arrays.asList("a", "b", "c"), Arrays.asList("ay", "by", "cy") ),
      Arguments.of(Arrays.asList("a", "b", "cy"), Arrays.asList("ay", "by") ),
      Arguments.of(Arrays.asList("xx", "ya", "zz"), Arrays.asList("xxy", "yay", "zzy") ),
      Arguments.of(Arrays.asList("xx", "yay", "zz"), Arrays.asList("xxy", "zzy") ),
      Arguments.of(Arrays.asList("yyx", "y", "zzz"), Arrays.asList("zzzy") ),
      Arguments.of(Arrays.asList("hello", "there"), Arrays.asList("helloy", "therey") ),
      Arguments.of(Arrays.asList("ya"), Arrays.asList("yay") ),
      Arguments.of(Arrays.asList(), Arrays.asList() ),
      Arguments.of(Arrays.asList(""), Arrays.asList("y") ),
      Arguments.of(Arrays.asList("xx", "yy", "zz"), Arrays.asList("xxy", "zzy") )
    );
  }

  @ParameterizedTest
  @MethodSource("NoYYTestSource")
  public void NoYYTest(List<String> nums, List<String> expected) {
    var actual = NoYY.noYY(nums);
    assertEquals(expected, actual);
  }
}
