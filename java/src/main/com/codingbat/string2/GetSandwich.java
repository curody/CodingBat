package main.com.codingbat.string2;

public class GetSandwich {
  public static String getSandwich(String str) {
    String s = "bread";
    int start = str.indexOf(s);
    int end = str.lastIndexOf(s);
    if (start == end) return "";
    return str.substring(start+s.length(), end);
  }
  
}
