# We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

def make_chocolate(small, big, goal):
  if (big*5 + small < goal):
    return -1
  if (big > 0 and goal >= 5):
    if (goal // 5 <= big):
      return goal - (goal // 5)*5 if goal - (goal // 5)*5 <= small else -1
    if ((goal // 5)*5 <= big*5 + small):
      return goal - big*5
  if (small > 0 and goal <= small):
    return goal
  return -1

def test_func(func, a, b, c, expected):
  result = func(a, b, c)
  return "{0}({1:>7}, {2:>7}, {3:>7}) → {4:2} == {5:2} ? {6:2}".format(func.__name__, a, b, c, expected, result, "OK" if result == expected else "X")

def test_cases():
  return [
    [4, 1, 9, 4],
    [4, 1, 10, -1],
    [4, 1, 7, 2],
    [6, 2, 7, 2],
    [4, 1, 5, 0],
    [4, 1, 4, 4],
    [5, 4, 9, 4],
    [9, 3, 18, 3],
    [3, 1, 9, -1],
    [1, 2, 7, -1],
    [1, 2, 6, 1],
    [1, 2, 5, 0],
    [6, 1, 10, 5],
    [6, 1, 11, 6],
    [6, 1, 12, -1],
    [6, 1, 13, -1],
    [6, 2, 10, 0],
    [6, 2, 11, 1],
    [6, 2, 12, 2],
    [60, 100, 550, 50],
    [1000, 1000000, 5000006, 6],
    [7, 1, 12, 7],
    [7, 1, 13, -1],
    [7, 2, 13, 3]
  ]

def test():
  for t in test_cases():
    print(test_func(make_chocolate, t[0], t[1], t[2], t[3]))

if __name__ == "__main__":
  test()
