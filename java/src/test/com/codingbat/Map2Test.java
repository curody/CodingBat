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
import main.com.codingbat.map2.WordLen;

public class Map2Test {
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
      Arguments.of((Object) new String[]{}, Map.of() )
    );
  }

  @ParameterizedTest
  @MethodSource("Word0TestSource")
  public void Word0Test(String[] strings, Map<String, Integer> expected) {
    var actual = Word0.word0(strings);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> WordLenTestSource() {
    return Stream.of(
      Arguments.of((Object) new String[]{"a", "bb", "a", "bb"},
        Map.of( "bb", 2, "a", 1 ) ),
      Arguments.of((Object) new String[]{"this", "and", "that", "and"},
        Map.of( "that", 4, "and", 3, "this", 4 ) ),
      Arguments.of((Object) new String[]{"code", "code", "code", "bug"},
        Map.of( "code", 4, "bug", 3 ) ),
      Arguments.of((Object) new String[]{},
        Map.of() ),
      Arguments.of((Object) new String[]{"z"},
        Map.of( "z", 1 ) )
    );
  }

  @ParameterizedTest
  @MethodSource("WordLenTestSource")
  public void WordLenTest(String[] strings, Map<String, Integer> expected) {
    var actual = WordLen.wordLen(strings);
    assertEquals(expected, actual);
  }
}
