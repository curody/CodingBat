# Given an array of ints, return True if the array contains a 2 next to a 2 somewhere.

def has22(nums):
  if len(nums) < 2:
    return False
  for i in range(len(nums)):
    if nums[i] == 2 and i+1 < len(nums) and nums[i+1] == 2:
      return True
  return False

def test_cases():
  return [
    [[1, 2, 2], True],
    [[1, 2, 1, 2], False],
    [[2, 1, 2], False],
    [[2, 2, 1, 2], True],
    [[1, 3, 2], False],
    [[1, 3, 2, 2], True],
    [[2, 3, 2, 2], True],
    [[4, 2, 4, 2, 2, 5], True],
    [[1, 2], False],
    [[2, 2], True],
    [[2], False],
    [[], False],
    [[3, 3, 2, 2], True],
    [[5, 2, 5, 2], False]
  ]

def test_func(fn, a, e, mxA, mxE, verbose):
  r = fn(a)
  fr = "{0}({1:"+str(mxA)+"}) → {2:>"+str(mxE)+"} == {3:>"+str(mxE)+"} ? {4:2}"
  ok = r == e
  if verbose or not ok:
    print(fr.format(fn.__name__, str(a), str(r), str(e), "OK" if ok else "X"))

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

def test(verbose):
  mxA = max_len(test_cases(), 'arg')
  mxE = max_len(test_cases(), 'exp')
  for t in test_cases():
    test_func(has22, t[0], t[1], mxA, mxE, verbose)

import sys

if __name__ == "__main__":
  test(sys.argv[1] == "-v" if len(sys.argv) > 1 else False)
