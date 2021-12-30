package main.com.codingbat.string2;

public class XyzMiddle {
  public static boolean xyzMiddle(String str) {
    if (str.length() < 3) return false;
    int mid = (str.length()+1)/2;
    String s = "xyz";
    return str.substring(mid-2, mid + (str.length()%2 == 0 ? 2 : 1)).contains(s);
  }
  
}
