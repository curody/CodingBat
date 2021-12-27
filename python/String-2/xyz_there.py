# Return True if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

def xyz_there(str):
  return str.count('xyz') > str.count('.xyz')

def test_func(fn, s, ex, mxA, mxE):
  rs = fn(s)
  return ("{0}({1:"+str(mxA)+"}) → {2:"+str(mxE)+"} == {3:"+str(mxE)+"} ? {4:2}")\
    .format(fn.__name__, s, str(rs), str(ex), "OK" if rs == ex else "X")

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
    ['abcxyz', True],
    ['abc.xyz', False],
    ['xyz.abc', True],
    ['abcxy', False],
    ['xyz', True],
    ['xy', False],
    ['x', False],
    ['', False],
    ['abc.xyzxyz', True],
    ['abc.xxyz', True],
    ['.xyz', False],
    ['12.xyz', False],
    ['12xyz', True],
    ['1.xyz.xyz2.xyz', False]
  ]

def test():
  for t in test_cases():
    print(test_func(xyz_there, t[0], t[1], max_len(test_cases(), 'arg'), max_len(test_cases(), 'exp')))

if __name__ == "__main__":
  test()
