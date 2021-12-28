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

import main.com.codingbat.functional2.NoNeg;

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
}
