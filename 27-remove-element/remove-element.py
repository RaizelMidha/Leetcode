class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        i=0
        k=0
        for i in range (len(nums)):
            if (nums[i]!=val):
                nums[k]=nums[i]
                k=k+1
                i=i+1
                continue;
            i=i+1
        return k

        