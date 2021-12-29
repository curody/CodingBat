package test.com.codingbat;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import main.com.codingbat.string2.DoubleChar;

public class String2Test {
  @ParameterizedTest
  @CsvSource({
    "The, TThhee",
    "AAbb, AAAAbbbb",
    "Hi-There, HHii--TThheerree",
    "Word!, WWoorrdd!!",
    "!!, !!!!",
    "'', ''",
    "a, aa",
    "., ..",
    "aa, aaaa",
  })
  public void GroupSumTest(String str, String expected) {
    var actual = DoubleChar.doubleChar(str);
    assertEquals(expected, actual);
  }
}
