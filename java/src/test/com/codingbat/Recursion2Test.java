package test.com.codingbat;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import main.com.codingbat.recursion2.GroupSum;
import main.com.codingbat.recursion2.GroupSum6;

public class Recursion2Test {
  static Stream<Arguments> GroupSumTestSource() {
    return Stream.of(
      Arguments.of(0, (Object) new int[]{2, 4, 8}, 10, true),
      Arguments.of(0, (Object) new int[]{2, 4, 8}, 14, true),
      Arguments.of(0, (Object) new int[]{2, 4, 8}, 9, false),
      Arguments.of(0, (Object) new int[]{2, 4, 8}, 8, true),
      Arguments.of(1, (Object) new int[]{2, 4, 8}, 8, true),
      Arguments.of(1, (Object) new int[]{2, 4, 8}, 2, false),
      Arguments.of(0, (Object) new int[]{1}, 1, true),
      Arguments.of(0, (Object) new int[]{9}, 1, false),
      Arguments.of(1, (Object) new int[]{9}, 0, true),
      Arguments.of(0, (Object) new int[]{}, 0, true),
      Arguments.of(0, (Object) new int[]{10, 2, 2, 5}, 17, true),
      Arguments.of(0, (Object) new int[]{10, 2, 2, 5}, 15, true),
      Arguments.of(0, (Object) new int[]{10, 2, 2, 5}, 9, true)
    );
  }

  @ParameterizedTest
  @MethodSource("GroupSumTestSource")
  public void GroupSumTest(int start, int[] nums, int target, boolean expected) {
    var actual = GroupSum.groupSum(start, nums, target);
    assertEquals(expected, actual);
  }
  static Stream<Arguments> GroupSum6TestSource() {
    return Stream.of(
      Arguments.of(0, (Object) new int[]{5, 6, 2}, 8, true),
      Arguments.of(0, (Object) new int[]{5, 6, 2}, 9, false),
      Arguments.of(0, (Object) new int[]{5, 6, 2}, 7, false),
      Arguments.of(0, (Object) new int[]{1}, 1, true),
      Arguments.of(0, (Object) new int[]{9}, 1, false),
      Arguments.of(0, (Object) new int[]{}, 0, true),
      Arguments.of(0, (Object) new int[]{3, 2, 4, 6}, 8, true),
      Arguments.of(0, (Object) new int[]{6, 2, 4, 3}, 8, true),
      Arguments.of(0, (Object) new int[]{5, 2, 4, 6}, 9, false),
      Arguments.of(0, (Object) new int[]{6, 2, 4, 5}, 9, false),
      Arguments.of(0, (Object) new int[]{3, 2, 4, 6}, 3, false),
      Arguments.of(0, (Object) new int[]{1, 6, 2, 6, 4}, 12, true),
      Arguments.of(0, (Object) new int[]{1, 6, 2, 6, 4}, 13, true),
      Arguments.of(0, (Object) new int[]{1, 6, 2, 6, 4}, 4, false),
      Arguments.of(0, (Object) new int[]{1, 6, 2, 6, 4}, 9, false),
      Arguments.of(0, (Object) new int[]{1, 6, 2, 6, 5}, 14, true),
      Arguments.of(0, (Object) new int[]{1, 6, 2, 6, 5}, 15, true),
      Arguments.of(0, (Object) new int[]{1, 6, 2, 6, 5}, 16, false)
    );
  }

  @ParameterizedTest
  @MethodSource("GroupSum6TestSource")
  public void GroupSum6Test(int start, int[] nums, int target, boolean expected) {
    var actual = GroupSum6.groupSum6(start, nums, target);
    assertEquals(expected, actual);
  }
}
