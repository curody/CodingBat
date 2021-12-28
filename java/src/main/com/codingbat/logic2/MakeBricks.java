package main.com.codingbat.logic2;
public class MakeBricks {
  /**
   * We want to make a row of bricks that is goal inches long. We have a number
   *  of small bricks (1 inch each) and big bricks (5 inches each). Return true
   *  if it is possible to make the goal by choosing from the given bricks.
   *  This is a little harder than it looks and can be done without any loops.
   *  See also: Introduction to MakeBricks
   * 
   * @param small Number of 1-inch-long bricks.
   * @param big   Number of 5-inch-long bricks.
   * @param goal  Desired brick row length in inches.
   * @return      True if goal can be reached with the given bricks, else false.
   */
  public static boolean makeBricks(int small, int big, int goal) {
    return goal/5 <= big 
      ? goal <= (goal/5)*5 + small 
      : goal <= big*5 + small;
  }
}
