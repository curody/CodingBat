package test.com.codingbat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import main.com.codingbat.map2.Word0;

public class Map2Test {
  @ParameterizedTest
  @MethodSource("Word0TestSource")
  public void Word0Test(String[] strings, Map<String, Integer> expected) {
    var actual = Word0.word0(strings);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> Word0TestSource() {
    return Stream.of(
      Arguments.of((Object) new String[]{"a", "b", "a", "b"},
        Map.of( "a", 0, "b", 0 ) ),
      Arguments.of((Object) new String[]{"a", "b", "a", "c", "b"},
        Map.of( "a", 0, "b", 0, "c", 0 ) ),
      Arguments.of((Object) new String[]{"c", "b", "a"},
        Map.of( "a", 0, "b", 0, "c", 0 ) ),
      Arguments.of((Object) new String[]{"c", "c", "c", "c"},
        Map.of( "c", 0 ) ),
      Arguments.of((Object) new String[0],
        Map.of() )
    );
  }
}
