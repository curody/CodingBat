package test.com.codingbat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import main.com.codingbat.map2.FirstChar;
import main.com.codingbat.map2.Pairs;
import main.com.codingbat.map2.Word0;
import main.com.codingbat.map2.WordCount;
import main.com.codingbat.map2.WordLen;

public class Map2Test {
  static Stream<Arguments> Word0TestSource() {
    return Stream.of(
      Arguments.of((Object) new String[]
				{"a", "b", "a", "b"},
        Map.of( "a", 0, "b", 0 ) ),
      Arguments.of((Object) new String[]
				{"a", "b", "a", "c", "b"},
        Map.of( "a", 0, "b", 0, "c", 0 ) ),
      Arguments.of((Object) new String[]
				{"c", "b", "a"},
        Map.of( "a", 0, "b", 0, "c", 0 ) ),
      Arguments.of((Object) new String[]
				{"c", "c", "c", "c"},
        Map.of( "c", 0 ) ),
      Arguments.of((Object) new String[]
				{}, Map.of() )
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
      Arguments.of((Object) new String[]
				{"a", "bb", "a", "bb"},
        Map.of( "bb", 2, "a", 1 ) ),
      Arguments.of((Object) new String[]
				{"this", "and", "that", "and"},
        Map.of( "that", 4, "and", 3, "this", 4 ) ),
      Arguments.of((Object) new String[]
				{"code", "code", "code", "bug"},
        Map.of( "code", 4, "bug", 3 ) ),
      Arguments.of((Object) new String[]{}, Map.of() ),
      Arguments.of((Object) new String[]{"z"}, Map.of( "z", 1 ) )
    );
  }

  @ParameterizedTest
  @MethodSource("WordLenTestSource")
  public void WordLenTest(String[] strings, Map<String, Integer> expected) {
    var actual = WordLen.wordLen(strings);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> PairsTestSource() {
    return Stream.of(
      Arguments.of((Object) new String[]
				{"code", "bug"},
        Map.of("b", "g", "c", "e") ),
      Arguments.of((Object) new String[]
				{"man", "moon", "main"},
        Map.of("m", "n") ),
      Arguments.of((Object) new String[]
				{"man", "moon", "good", "night"},
        Map.of("g", "d", "m", "n", "n", "t") ),
      Arguments.of((Object) new String[]{}, Map.of() ),
      Arguments.of((Object) new String[]
				{"a", "b"},
        Map.of("a", "a", "b", "b") ),
      Arguments.of((Object) new String[]
				{"are", "codes", "and", "cods"},
        Map.of("a", "d", "c", "s") ),
      Arguments.of((Object) new String[]
				{"apple", "banana", "tea", "coffee"},
        Map.of("a", "e", "b", "a", "c", "e", "t", "a") )
    );
  }

  @ParameterizedTest
  @MethodSource("PairsTestSource")
  public void PairsTest(String[] strings, Map<String, String> expected) {
    var actual = Pairs.Pairs(strings);
    assertEquals(expected, actual);
  }

  static Stream<Arguments> WordCountTestSource() {
    return Stream.of(
      Arguments.of((Object) new String[]
				{ "a", "b", "a", "c", "b"},
        Map.of("a", 2, "b", 2, "c", 1) ),
      Arguments.of((Object) new String[]
				{ "c", "b", "a"},
        Map.of("a", 1, "b", 1, "c", 1) ),
      Arguments.of((Object) new String[]
				{ "c", "c", "c", "c"},
        Map.of("c", 4) ),
      Arguments.of((Object) new String[]{}, Map.of() ),
      Arguments.of((Object) new String[]
				{ "this", "and", "this", ""},
        Map.of("", 1, "and", 1, "this", 2) ),
      Arguments.of((Object) new String[]
				{ "x", "y", "x", "Y", "X"},
        Map.of("x", 2, "X", 1, "y", 1, "Y", 1) ),
      Arguments.of((Object) new String[]
				{ "123", "0", "123", "1"},
        Map.of("0", 1, "1", 1, "123", 2) ),
      Arguments.of((Object) new String[]
				{ "d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x",
          "b", "f", "x", "two", "b", "one", "two"},
        Map.of("a", 4, "b", 5, "d", 3, "e", 1, "f", 1, "one", 1, "x", 2, "z",
          2, "two", 2) ),
      Arguments.of((Object) new String[]
				{ "apple", "banana", "apple", "apple", "tea", "coffee", "banana"},
        Map.of("banana", 2, "apple", 3, "tea", 1, "coffee", 1) )
    );
  }

  @ParameterizedTest
  @MethodSource("WordCountTestSource")
  public void WordCountTest(String[] strings, Map<String, String> expected) {
    var actual = WordCount.wordCount(strings);
    assertEquals(expected, actual);
  }
  
  static Stream<Arguments> FirstCharTestSource() {
    return Stream.of(
      Arguments.of((Object) new String[]
				{ "salt", "tea", "soda", "toast" },
        Map.of("s", "saltsoda", "t", "teatoast") ),
      Arguments.of((Object) new String[]
				{ "aa", "bb", "cc", "aAA", "cCC", "d" },
        Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d") ),
      Arguments.of((Object) new String[]{}, Map.of() ),
      Arguments.of((Object) new String[]
				{ "apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells" },
        Map.of("a", "appleaardvark", "b", "bellsbellsbells", "s", "saltsun", "z", "zen") )
    );
  }

  @ParameterizedTest
  @MethodSource("FirstCharTestSource")
  public void FirstCharTest(String[] strings, Map<String, String> expected) {
    var actual = FirstChar.firstChar(strings);
    assertEquals(expected, actual);
  }
}
