# Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in min(v1, v2) and max(v1, v2) functions return the smaller or larger of two values.

def big_diff(nums):
  return max(nums) - min(nums)

def test_func(fn, arr, ex, mxA, mxE):
  rs = fn(arr)
  return ("{0}({1:"+str(mxA)+"}) → {2:"+str(mxE)+"} == {3:"+str(mxE)+"} ? {4:2}")\
    .format(fn.__name__, str(arr), str(rs), str(ex), "OK" if rs == ex else "X")

def test_cases():
  return [
    [[10, 3, 5, 6], 7],
    [[7, 2, 10, 9], 8],
    [[2, 10, 7, 2], 8]
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
    print(test_func(big_diff, t[0], t[1], max_len(test_cases(), 'arg'), max_len(test_cases(), 'exp')))

if __name__ == "__main__":
  test()
