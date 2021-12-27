# Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

# import re

# def count_code(str):
#   return len(re.findall('co[\S,\$]e', str))

def count_code(str):
  return count_like(str, 'co?e')

def count_like(str, term):
  count = 0
  for i in range(len(str)-len(term)+1):
    if str[i] == term[0]:
      for j in range(1, len(term)):
        if str[i+j] != term[j] and term[j] != '?':
          break
        if j == len(term)-1:
          count += 1
  return count

def test_func(func, s, expected):
  result = func(s)
  return "{0}({1:>21}) → {2:1} == {3:1} ? {4:2}".format(func.__name__, s, str(result), str(expected), "OK" if result == expected else "X")

def test_cases():
  return [
    ['aaacodebbb', 1],
    ['codexxcode', 2],
    ['cozexxcope', 2],
    ['cozfxxcope', 1],
    ['xxcozeyycop', 1],
    ['cozcop', 0],
    ['abcxyz', 0],
    ['code', 1],
    ['ode', 0],
    ['c', 0],
    ['', 0],
    ['AAcodeBBcoleCCccoreDD', 3],
    ['AAcodeBBcoleCCccorfDD', 2],
    ['coAcodeBcoleccoreDD', 3]
  ]

def test():
  for t in test_cases():
    print(test_func(count_code, t[0], t[1]))

if __name__ == "__main__":
  test()
