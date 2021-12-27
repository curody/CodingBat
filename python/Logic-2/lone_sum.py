# Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

def lone_sum(a, b, c):
  return sum(uniques([a, b, c]))
  
def uniques(arr):
  return [x for x in arr if arr.count(x) == 1]

def test_lone_sum(a, b, c, expected):
  result = lone_sum(a, b, c)
  return "{0}({1:>1}, {2:>1}, {3:>1}) → {4:2} == {5:2} ? {6:2}".format(lone_sum.__name__, a, b, c, expected, result, "OK" if result == expected else "X")

def test_cases():
  return [
    [1, 2, 3, 6],
    [3, 2, 3, 2],
    [3, 3, 3, 0],
    [9, 2, 2, 9],
    [2, 2, 9, 9],
    [2, 9, 2, 9],
    [2, 9, 3, 14],
    [4, 2, 3, 9],
    [1, 3, 1, 3]
  ]

def test():
  for t in test_cases():
    print(test_lone_sum(t[0], t[1], t[2], t[3]))

if __name__ == "__main__":
  test()
