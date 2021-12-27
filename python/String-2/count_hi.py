# Return the number of times that the string "hi" appears anywhere in the given string.

# def count_hi(str):
#   return str.count('hi')

def count_hi(str):
  return count(str, 'hi')

def count(str, term):
  count = 0
  for i in range(len(str)-len(term)+1):
    if str[i:i+len(term)] == term:
      count +=1
  return count

def test_func(func, s, expected):
  result = func(s)
  return "{0}({1:>18}) → {2:2} == {3:2} ? {4:2}".format(func.__name__, s, expected, result, "OK" if result == expected else "X")

def test_cases():
  return [
    ['abc hi ho', 1],
    ['ABChi hi', 2],
    ['hihi', 2],
    ['hiHIhi', 2],
    ['', 0],
    ['h', 0],
    ['hi', 1],
    ['Hi is no HI on ahI', 0],
    ['hiho not HOHIhi', 2]
  ]

def test():
  for t in test_cases():
    print(test_func(count_hi, t[0], t[1]))

if __name__ == "__main__":
  test()
