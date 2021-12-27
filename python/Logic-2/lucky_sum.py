# Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

def lucky_sum(a, b, c):
  arr = [a, b, c]
  return sum([arr[i] for i in range(0, len(arr)) if not 13 in arr or i < arr.index(13)])

def test_func(func, a, b, c, expected):
  result = func(a, b, c)
  return "{0}({1:>2}, {2:>2}, {3:>2}) → {4:2} == {5:2} ? {6:2}".format(func.__name__, a, b, c, expected, result, "OK" if result == expected else "X")

def test_cases():
  return [
    [1, 2, 3, 6],
    [1, 2, 13, 3],
    [1, 13, 3, 1],
    [1, 13, 13, 1],
    [6, 5, 2, 13],
    [13, 2, 3, 0],
    [13, 2, 13, 0],
    [13, 13, 2, 0],
    [9, 4, 13, 13],
    [8, 13, 2, 8],
    [7, 2, 1, 10],
    [3, 3, 13, 6]
  ]

def test():
  for t in test_cases():
    print(test_func(lucky_sum, t[0], t[1], t[2], t[3]))

if __name__ == "__main__":
  test()
