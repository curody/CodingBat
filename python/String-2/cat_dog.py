# Return True if the string "cat" and "dog" appear the same number of times in the given string.

# def cat_dog(str):
#   return str.count('cat') == str.count('dog')

def cat_dog(str):
  return count(str, 'cat') == count(str, 'dog')

def count(str, term):
  count = 0
  for i in range(len(str)-len(term)+1):
    if str[i:i+len(term)] == term:
      count +=1
  return count

def test_func(func, s, expected):
  result = func(s)
  return "{0}({1:>15}) → {2:5} == {3:5} ? {4:2}".format(func.__name__, s, str(expected), str(result), "OK" if result == expected else "X")

def test_cases():
  return [
    ['catdog', True],
    ['catcat', False],
    ['1cat1cadodog', True],
    ['catxxdogxxxdog', False],
    ['catxdogxdogxcat', True],
    ['catxdogxdogxca', False],
    ['dogdogcat', False],
    ['dogogcat', True],
    ['dog', False],
    ['cat', False],
    ['ca', True],
    ['c', True],
    ['', True]
  ]

def test():
  for t in test_cases():
    print(test_func(cat_dog, t[0], t[1]))

if __name__ == "__main__":
  test()
