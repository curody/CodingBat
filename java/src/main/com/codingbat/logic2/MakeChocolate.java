package main.com.codingbat.logic2;

public class MakeChocolate {
  /**
   * We want make a package of goal kilos of chocolate. We have small bars (1
   *  kilo each) and big bars (5 kilos each). Return the number of small bars
   *  to use, assuming we always use big bars before small bars. Return -1 if
   *  it can't be done.
   * 
   * @param small Number of 1 kg bars.
   * @param big   Number of 5 kg bars.
   * @param goal  Desired mass in kg of chocolate to package.
   * @return If goal is reachable then number of small bars used, else -1.
   */
  public static int makeChocolate(int small, int big, int goal) {
    if (small+big*5 < goal) return -1;
    if (big > 0 && goal >= 5) {
      if (goal/5 <= big) return goal-(goal/5)*5 <= small ? goal-(goal/5)*5 : -1;
      if ((goal/5)*5 <= big*5+small) return goal-big*5;
    }
    return small > 0 && goal <= small ? goal : 0;
  }
  
  
}
