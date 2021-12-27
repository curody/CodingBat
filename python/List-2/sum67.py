# Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

def sum67(nums):
  if len(nums) == 0:
    return 0
  result = [x for x in nums]
  flag = False
  for i in range(len(nums)):
    if result[i] == 6:
      flag = True
    elif result[i] == 7:
      if flag:
        result[i] = 0
      flag = False
    if flag:
      result[i] = 0
  return sum(result)

def test_cases():
  return [
    [[1, 2, 2], 5],
    [[1, 2, 2, 6, 99, 99, 7], 5],
    [[1, 1, 6, 7, 2], 4],
    [[1, 6, 2, 2, 7, 1, 6, 99, 99, 7], 2],
    [[1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7], 2],
    [[2, 7, 6, 2, 6, 7, 2, 7], 18],
    [[2, 7, 6, 2, 6, 2, 7], 9],
    [[1, 6, 7, 7], 8],
    [[6, 7, 1, 6, 7, 7], 8],
    [[6, 8, 1, 6, 7], 0],
    [[], 0],
    [[6, 7, 11], 11],
    [[11, 6, 7, 11], 22],
    [[2, 2, 6, 7, 7], 11]
  ]

def test_func(fn, arr, ex, mxA, mxE, verbose):
  rs = fn(arr)
  fr = "{0}({1:"+str(mxA)+"}) → {2:>"+str(mxE)+"} == {3:>"+str(mxE)+"} ? {4:2}"
  if verbose or str(rs) != str(ex):
    print(fr.format(fn.__name__, str(arr), str(rs), str(ex), "OK" if rs == ex else "X"))

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
  for t in test_cases():
    test_func(sum67, t[0], t[1], max_len(test_cases(), 'arg'), max_len(test_cases(), 'exp'), verbose)

import sys

if __name__ == "__main__":
  test(sys.argv[1] == "-v" if len(sys.argv) > 1 else False)
