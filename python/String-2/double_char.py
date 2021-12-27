# Given a string, return a string where for every char in the original, there are two chars.

def double_char(str):
  return "".join([a + a for a in str])

def test_func(func, s, expected):
  result = func(s)
  return "{0}({1:>10}) → {2:20} == {3:20} ? {4:2}".format(func.__name__, s, expected, result, "OK" if result == expected else "X")

def test_cases():
  return [
    ['The', 'TThhee'],
    ['AAbb', 'AAAAbbbb'],
    ['Hi-There', 'HHii--TThheerree']
  ]

def test():
  for t in test_cases():
    print(test_func(double_char, t[0], t[1]))

if __name__ == "__main__":
  test()
