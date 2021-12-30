package test.com.codingbat;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import main.com.codingbat.string2.BobThere;
import main.com.codingbat.string2.CatDog;
import main.com.codingbat.string2.CountCode;
import main.com.codingbat.string2.CountHi;
import main.com.codingbat.string2.DoubleChar;
import main.com.codingbat.string2.EndOther;
import main.com.codingbat.string2.XyzThere;

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
  
  @ParameterizedTest
  @CsvSource({
    "catdog, true",
    "catcat, false",
    "1cat1cadodog, true",
    "catxxdogxxxdog, false",
    "catxdogxdogxcat, true",
    "catxdogxdogxca, false",
    "dogdogcat, false",
    "dogogcat, true",
    "dog, false",
    "cat, false",
    "ca, true",
    "c, true",
    "'', true",
  })
  public void CatDogTest(String str, boolean expected) {
    var actual = CatDog.catDog(str);
    assertEquals(expected, actual);
  }
  
  @ParameterizedTest
  @CsvSource({
    "aaacodebbb, 1",
    "codexxcode, 2",
    "cozexxcope, 2",
    "cozfxxcope, 1",
    "xxcozeyycop, 1",
    "cozcop, 0",
    "abcxyz, 0",
    "code, 1",
    "ode, 0",
    "c, 0",
    "'', 0",
    "AAcodeBBcoleCCccoreDD, 3",
    "AAcodeBBcoleCCccorfDD, 2",
    "coAcodeBcoleccoreDD, 3"
  })
  public void CountCodeTest(String str, int expected) {
    var actual = CountCode.countCode(str);
    assertEquals(expected, actual);
  }
  
  @ParameterizedTest
  @CsvSource({
    "Hiabc, abc, true",
    "AbC, HiaBc, true",
    "abc, abXabc, true",
    "Hiabc, abcd, false",
    "Hiabc, bc, true",
    "Hiabcx, bc, false",
    "abc, abc, true",
    "xyz, 12xyz, true",
    "yz, 12xz, false",
    "Z, 12xz, true",
    "12, 12, true",
    "abcXYZ, abcDEF, false",
    "ab, ab12, false",
    "ab, 12ab, true"
  })
  public void EndOtherTest(String a, String b, boolean expected) {
    var actual = EndOther.endOther(a, b);
    assertEquals(expected, actual);
  }
  
  @ParameterizedTest
  @CsvSource({
    "abcxyz, true",
    "abc.xyz, false",
    "xyz.abc, true",
    "abcxy, false",
    "xyz, true",
    "xy, false",
    "x, false",
    "'', false",
    "abc.xyzxyz, true",
    "abc.xxyz, true",
    ".xyz, false",
    "12.xyz, false",
    "12xyz, true",
    "1.xyz.xyz2.xyz, false"
  })
  public void XyzThereTest(String str, boolean expected) {
    var actual = XyzThere.xyzThere(str);
    assertEquals(expected, actual);
  }
  
  @ParameterizedTest
  @CsvSource({
    "abcbob, true",
    "b9b, true",
    "bac, false",
    "bbb, true",
    "abcdefb, false",
    "123abcbcdbabxyz, true",
    "b12, false",
    "b1b, true",
    "b12b1b, true",
    "bbc, false",
    "bbb, true",
    "bb, false",
    "b, false",
  })
  public void BobThereTest(String str, boolean expected) {
    var actual = BobThere.bobThere(str);
    assertEquals(expected, actual);
  }
}
