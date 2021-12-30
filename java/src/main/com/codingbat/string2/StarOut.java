package main.com.codingbat.string2;

public class StarOut {
  public static String starOut(String str) {
    return str.replaceAll(".?\\*+.?", "");
  }  
}
