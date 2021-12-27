# Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

def count_evens(nums):
  return len([i for i in nums if i%2 == 0])

def test_func(fn, arr, ex, mxA, mxE):
  rs = fn(arr)
  return ("{0}({1:"+str(mxA)+"}) → {2:"+str(mxE)+"} == {3:"+str(mxE)+"} ? {4:2}")\
    .format(fn.__name__, str(arr), str(rs), str(ex), "OK" if rs == ex else "X")

def test_cases():
  return [
    [[2, 1, 2, 3, 4], 3],
    [[2, 2, 0], 3],
    [[1, 3, 5], 0],
    [[], 0],
    [[11, 9, 0, 1], 1],
    [[2, 11, 9, 0], 2],
    [[2], 1],
    [[2, 5, 12], 2],
  ]

def max_len(arr, flg):
  res = 1
  if flg == 'arg':
    for i in [sub[:-1] for sub in arr]:
      for j in i:
        if len(str(j)) > res:
          res = len(str(j))
  else:
    for i in [sub[-1] for sub in arr]:
      if len(str(i)) > res:
        res = len(str(i))
  return res

def test():
  for t in test_cases():
    print(test_func(count_evens, t[0], t[1], max_len(test_cases(), 'arg'), max_len(test_cases(), 'exp')))

if __name__ == "__main__":
  test()
