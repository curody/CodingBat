package main.com.codingbat.string2;

public class OneTwo {
  public static String oneTwo(String str) {
    String strTruncated = str.substring(0, (str.length()/3)*3);
    char[] res = strTruncated.toCharArray();
    for (int i=0; i < str.length()-2; i += 3) {
      res[i] = str.charAt(i+1);
      res[i+1] = str.charAt(i+2);
      res[i+2] = str.charAt(i);
    }
    return String.valueOf(res);
  }
  
}
