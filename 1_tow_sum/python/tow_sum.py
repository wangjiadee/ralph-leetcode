# -*- coding: UTF-8 -*-
class Solution:
    """
    给定一个整数数组nums和一个整数目标值target,请你在该数组中找出和为目标值的那两整数,
    并返回它们的数组下标。你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在
    答案里不能重复出现。你可以按任意顺序返回答案。
    """

    def Two_For_Loops(self, nums, target):
        for n in range(len(nums)):
            for m in range(n+1, len(nums)):
                if nums[n] + nums[m] == target:
                    print("[{0},{1}]".format(n, m))
                    return n, m

    def One_For_Loops(self, nums, target):
        for i in range(len(nums)):
            if target-nums[i] in nums:
                print("[{0},{1}]".format(i, nums.index(target-nums[i])))
                return i, nums.index(target-nums[i])

    def With_Dict(self, nums, target):
        TEMPDICT = {}
        for i in range(len(nums)):
            a = target - nums[i]
            if a in TEMPDICT:
                print(TEMPDICT[a], i)
                return TEMPDICT[a], i
            else:
                TEMPDICT[nums[i]] = i


if __name__ == "__main__":
    nums = [2, 7, 11, 15, 30, 45, 78]
    target = 45
    Solution().Two_For_Loops(nums, target)
    Solution().One_For_Loops(nums, target)
    Solution().With_Dict(nums, target)
