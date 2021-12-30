package main.com.codingbat.string2;

public class CountCode {
  /**
   * Return the number of times that the string "code" appears anywhere in the
   * given string, except we'll accept any letter for the 'd', so "cope" and
   * "cooe" count.
   * 
   * @param str String of characters.
   * @return Count of "co*e" where '*' is any letter.
   */
  public static int countCode(String str) {
    String s = "code";
    int count = 0;
    for (int i=0; i < str.length() - s.length()+1; i++) {
      if ((str.substring(i, i+s.length()-2) 
          + 'd' 
          + str.substring(i+s.length()-1, i+s.length()))
          .equals(s)) {
        count++;
      }
    }
    return count;
  }
  
}
