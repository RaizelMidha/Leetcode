class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """


        k=1
        i=1
        
        while (i<len(nums)):
            if(nums[i]==nums[i-1]):
                i=i+1

                continue;
            nums[k]=nums[i]
            i=i+1
            k=k+1
        return k

        