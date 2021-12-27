# Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

def centered_average(nums):
  result = [x for x in nums]
  result.remove(max(nums))
  result.remove(min(nums))
  return sum(result)//len(result)

def test_func(fn, arr, ex, mxA, mxE):
  rs = fn(arr)
  return ("{0}({1:"+str(mxA)+"}) → {2:>"+str(mxE)+"} == {3:>"+str(mxE)+"} ? {4:2}")\
    .format(fn.__name__, str(arr), str(rs), str(ex), "OK" if rs == ex else "X")

def test_cases():
  return [
    [[1, 2, 3, 4, 100], 3],
    [[1, 1, 5, 5, 10, 8, 7], 5],
    [[-10, -4, -2, -4, -2, 0], -3],
    [[5, 3, 4, 6, 2], 4],
    [[5, 3, 4, 0, 100], 4],
    [[100, 0, 5, 3, 4], 4],
    [[4, 0, 100], 4],
    [[0, 2, 3, 4, 100], 3],
    [[1, 1, 100], 1],
    [[7, 7, 7], 7],
    [[1, 7, 8], 7],
    [[1, 1, 99, 99], 50],
    [[1000, 0, 1, 99], 50],
    [[4, 4, 4, 4, 5], 4],
    [[4, 4, 4, 1, 5], 4],
    [[6, 4, 8, 12, 3], 6]
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
    print(test_func(centered_average, t[0], t[1], max_len(test_cases(), 'arg'), max_len(test_cases(), 'exp')))

if __name__ == "__main__":
  test()
