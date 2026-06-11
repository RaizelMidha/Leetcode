class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i =0
        k = 0
        count=0
        for i in range(len(nums)):

            if (i!=0 and nums[i]==nums[i-1]):
                count=count+1
            else:
                count=0
            if count >1:
                i=i+1
                continue
            nums[k]=nums[i]
            k=k+1
            i=i+1

        return k

    