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

import main.com.codingbat.functional2.No9;
import main.com.codingbat.functional2.NoNeg;
import main.com.codingbat.functional2.NoTeen;

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

  
}
