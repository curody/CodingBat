package test.com.codingbat;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import main.com.codingbat.string2.CountHi;
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
  public void DoubleCharTest(String str, String expected) {
    var actual = DoubleChar.doubleChar(str);
    assertEquals(expected, actual);
  }
  
  @ParameterizedTest
  @CsvSource({
    "abc hi ho, 1",
    "ABChi hi, 2",
    "hihi, 2",
    "hiHIhi, 2",
    "'', 0",
    "h, 0",
    "hi, 1",
    "Hi is no HI on ahI, 0",
    "hiho not HOHIhi, 2"
  })
  public void CountHiTest(String str, int expected) {
    var actual = CountHi.countHi(str);
    assertEquals(expected, actual);
  }
}
