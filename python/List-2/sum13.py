# Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

def sum13(nums):
  if len(nums) == 0:
    return 0
  result = [x for x in nums]
  for i in range(len(nums)):
    if result[i] == 13:
      result[i] = 0
      if i+1 < len(nums):
        result[i+1] = 0
  return sum(result)

def test_cases():
  return [
    [[1, 2, 2, 1], 6],
    [[1, 1], 2],
    [[1, 2, 2, 1, 13], 6],
    [[1, 2, 13, 2, 1, 13], 4],
    [[13, 1, 2, 13, 2, 1, 13], 3],
    [[], 0],
    [[13], 0],
    [[13, 13], 0],
    [[13, 0, 13], 0],
    [[13, 1, 13], 0],
    [[5, 7, 2], 14],
    [[5, 13, 2], 5],
    [[0], 0],
    [[13, 0], 0]
  ]

def test_func(fn, arr, ex, mxA, mxE):
  rs = fn(arr)
  return ("{0}({1:"+str(mxA)+"}) → {2:>"+str(mxE)+"} == {3:>"+str(mxE)+"} ? {4:2}")\
    .format(fn.__name__, str(arr), str(rs), str(ex), "OK" if rs == ex else "X")

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
    print(test_func(sum13, t[0], t[1], max_len(test_cases(), 'arg'), max_len(test_cases(), 'exp')))

if __name__ == "__main__":
  test()
