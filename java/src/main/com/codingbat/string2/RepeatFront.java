package main.com.codingbat.string2;

public class RepeatFront {
  public static String repeatFront(String str, int n) {
    String res = str.substring(0, n);
    for (int i=n-1; i > -1; i--) {
      res = res.concat(str.substring(0, i));
    }
    return res;
  }
}
