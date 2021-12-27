# Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "def fix_teen(n):"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main no_teen_sum().

def no_teen_sum(a, b, c):
  # return sum([fix_teen(i) for i in [a, b, c]])
  return sum([i for i in [a, b, c] if i in [15, 16] or not i in [j for j in range(13, 19+1)]])

def fix_teen(n):
  return n if n in [15, 16] or not n in [i for i in range(13, 19+1)] else 0

def test_func(func, a, b, c, expected):
  result = func(a, b, c)
  return "{0}({1:>2}, {2:>2}, {3:>2}) → {4:2} == {5:2} ? {6:2}".format(func.__name__, a, b, c, expected, result, "OK" if result == expected else "X")

def test_cases():
  return [
    [1, 2, 3, 6],
    [2, 13, 1, 3],
    [2, 1, 14, 3],
    [2, 1, 15, 18],
    [2, 1, 16, 19],
    [2, 1, 17, 3],
    [17, 1, 2, 3],
    [2, 15, 2, 19],
    [16, 17, 18, 16],
    [17, 18, 19, 0],
    [15, 16, 1, 32],
    [15, 15, 19, 30],
    [15, 19, 16, 31],
    [5, 17, 18, 5],
    [17, 18, 16, 16],
    [17, 19, 18, 0]
  ]

def test():
  for t in test_cases():
    print(test_func(no_teen_sum, t[0], t[1], t[2], t[3]))

if __name__ == "__main__":
  test()
