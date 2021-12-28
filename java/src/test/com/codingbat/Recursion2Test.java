package test.com.codingbat;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import main.com.codingbat.recursion2.GroupNoAdj;
import main.com.codingbat.recursion2.GroupSum;
import main.com.codingbat.recursion2.GroupSum5;
import main.com.codingbat.recursion2.GroupSum6;
import main.com.codingbat.recursion2.GroupSumClump;
import main.com.codingbat.recursion2.SplitArray;

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
  
  static Stream<Arguments> GroupNoAdjTestSource() {
    return Stream.of(
      Arguments.of(0, new int[]{2, 5, 10, 4}, 12, true),
      Arguments.of(0, new int[]{2, 5, 10, 4}, 14, false),
      Arguments.of(0, new int[]{2, 5, 10, 4}, 7, false),
      Arguments.of(0, new int[]{2, 5, 10, 4, 2}, 7, true),
      Arguments.of(0, new int[]{2, 5, 10, 4}, 9, true),
      Arguments.of(0, new int[]{10, 2, 2, 3, 3}, 15, true),
      Arguments.of(0, new int[]{10, 2, 2, 3, 3}, 7, false),
      Arguments.of(0, new int[]{}, 0, true),
      Arguments.of(0, new int[]{1}, 1, true),
      Arguments.of(0, new int[]{9}, 1, false),
      Arguments.of(0, new int[]{9}, 0, true),
      Arguments.of(0, new int[]{5, 10, 4, 1}, 11, true)
    );
  }

  @ParameterizedTest
  @MethodSource("GroupNoAdjTestSource")
  public void GroupNoAdjTest(int start, int[] nums, int target, boolean expected) {
    var actual = GroupNoAdj.groupNoAdj(start, nums, target);
    assertEquals(expected, actual);
  }
  
  static Stream<Arguments> GroupSum5TestSource() {
    return Stream.of(
      Arguments.of(0, new int[]{2, 5, 10, 4}, 19, true),
      Arguments.of(0, new int[]{2, 5, 10, 4}, 17, true),
      Arguments.of(0, new int[]{2, 5, 10, 4}, 12, false),
      Arguments.of(0, new int[]{2, 5, 4, 10}, 12, false),
      Arguments.of(0, new int[]{3, 5, 1}, 4, false),
      Arguments.of(0, new int[]{3, 5, 1}, 5, true),
      Arguments.of(0, new int[]{1, 3, 5}, 5, true),
      Arguments.of(0, new int[]{3, 5, 1}, 9, false),
      Arguments.of(0, new int[]{2, 5, 10, 4}, 7, false),
      Arguments.of(0, new int[]{2, 5, 10, 4}, 15, true),
      Arguments.of(0, new int[]{2, 5, 10, 4}, 11, false),
      Arguments.of(0, new int[]{1}, 1, true),
      Arguments.of(0, new int[]{9}, 1, false),
      Arguments.of(0, new int[]{9}, 0, true),
      Arguments.of(0, new int[]{}, 0, true)
    );
  }

  @ParameterizedTest
  @MethodSource("GroupSum5TestSource")
  public void GroupSum5Test(int start, int[] nums, int target, boolean expected) {
    var actual = GroupSum5.groupSum5(start, nums, target);
    assertEquals(expected, actual);
  }
  
  static Stream<Arguments> GroupSumClumpsTestSource() {
    return Stream.of(
      Arguments.of(0, new int[]{2, 4, 8}, 10, true),
      Arguments.of(0, new int[]{1, 2, 4, 8, 1}, 14, true),
      Arguments.of(0, new int[]{2, 4, 4, 8}, 14, false),
      Arguments.of(0, new int[]{8, 2, 2, 1}, 9, true),
      Arguments.of(0, new int[]{8, 2, 2, 1}, 11, false),
      Arguments.of(0, new int[]{1}, 1, true),
      Arguments.of(0, new int[]{9}, 1, false)
    );
  }

  @ParameterizedTest
  @MethodSource("GroupSumClumpsTestSource")
  public void GroupSumClumpsTest(int start, int[] nums, int target, boolean expected) {
    var actual = GroupSumClump.groupSumClump(start, nums, target);
    assertEquals(expected, actual);
  }
  
  static Stream<Arguments> SplitArrayTestSource() {
    return Stream.of(
      Arguments.of(new int[]{2, 2}, true),
      Arguments.of(new int[]{2, 3}, false),
      Arguments.of(new int[]{5, 2, 3}, true),
      Arguments.of(new int[]{5, 2, 2}, false),
      Arguments.of(new int[]{1, 1, 1, 1, 1, 1}, true),
      Arguments.of(new int[]{1, 1, 1, 1, 1}, false),
      Arguments.of(new int[]{}, true),
      Arguments.of(new int[]{1}, false),
      Arguments.of(new int[]{3, 5}, false),
      Arguments.of(new int[]{5, 3, 2}, true),
      Arguments.of(new int[]{2, 2, 10, 10, 1, 1}, true),
      Arguments.of(new int[]{1, 2, 2, 10, 10, 1, 1}, false),
      Arguments.of(new int[]{1, 2, 3, 10, 10, 1, 1}, true)
    );
  }

  @ParameterizedTest
  @MethodSource("SplitArrayTestSource")
  public void SplitArrayTest(int[] nums, boolean expected) {
    var actual = SplitArray.splitArray(nums);
    assertEquals(expected, actual);
  }
}
