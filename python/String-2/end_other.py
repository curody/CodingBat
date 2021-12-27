# Given two strings, return True if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: s.lower() returns the lowercase version of a string.

def end_other(a, b):
  return (a.lower().endswith(b.lower()) or b.lower().endswith(a.lower()))

# def end_other(a, b):
#   return end(a.lower(), b.lower()) or end(b.lower(), a.lower())

# def end(a, b):
#   return b in a and a[-(len(b)):] == b

def test_func(fn, a, b, ex, mxA, mxE):
  rs = fn(a, b)
  return ("{0}({1:"+str(mxA)+"}, {2:"+str(mxA)+"}) → {3:"+str(mxE)+"} == {4:"+str(mxE)+"} ? {5:2}")\
    .format(fn.__name__, a, b, str(rs), str(ex), "OK" if rs == ex else "X")

def max_len(arr, pos):
  res = 1
  if pos == 'arg':
    for i in [sub[:-1] for sub in arr]:
      for j in i:
        if len(str(j)) > res:
          res = len(str(j))
  else:
    for i in [sub[-1] for sub in arr]:
      if len(str(i)) > res:
        res = len(str(i))
  return res

def test_cases():
  return [
    ['Hiabc', 'abc', True],
    ['AbC', 'HiaBc', True],
    ['abc', 'abXabc', True],
    ['Hiabc', 'abcd', False],
    ['Hiabc', 'bc', True],
    ['Hiabcx', 'bc', False],
    ['abc', 'abc', True],
    ['xyz', '12xyz', True],
    ['yz', '12xz', False],
    ['Z', '12xz', True],
    ['12', '12', True],
    ['abcXYZ', 'abcDEF', False],
    ['ab', 'ab12', False],
    ['ab', '12ab', True]
  ]

def test():
  for t in test_cases():
    print(test_func(end_other, t[0], t[1], t[2], max_len(test_cases(), 'arg'), max_len(test_cases(), 'exp')))

if __name__ == "__main__":
  test()
