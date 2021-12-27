# Given three ints, a b c, return True if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: abs(num) computes the absolute value of a number.

def close_far(a, b, c):
  if (abs(a-b)<=1):
    return c - max(a,b) >= 2 or min(a,b) - c >= 2
  if (abs(a-c)<=1):
    return b - max(a,c) >= 2 or min(a,c) - b >= 2
  return False
  
def max(x, y):
  return y if y > x else x

def min(x, y):
  return y if y < x else x

def test_func(func, a, b, c, expected):
  result = func(a, b, c)
  return "{0}({1:>2}, {2:>2}, {3:>2}) → {4:5} == {5:5} ? {6:2}".format(func.__name__, a, b, c, str(expected), str(result), "OK" if result == expected else "X")

def test_cases():
  return [
    [1, 2, 10, True],
    [1, 2, 3, False],
    [4, 1, 3, True],
    [4, 5, 3, False],
    [4, 3, 5, False],
    [-1, 10, 0, True],
    [0, -1, 10, True],
    [10, 10, 8, True],
    [10, 8, 9, False],
    [8, 9, 10, False],
    [8, 9, 7, False],
    [8, 6, 9, True]
  ]

def test():
  for t in test_cases():
    print(test_func(close_far, t[0], t[1], t[2], t[3]))

if __name__ == "__main__":
  test()
