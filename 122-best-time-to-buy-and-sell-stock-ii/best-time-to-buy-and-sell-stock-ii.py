class Solution(object):
    def maxProfit(self, num):
        """
        :type prices: List[int]
        :rtype: int
        """
        curr_min=num[0]
        diff=0
        for i in range (len(num)-1):
            if (num[i+1]>num[i]):
                diff= diff+ (num[i+1]-num[i])
                i = i+1
            else:
                curr_min=num[i+1]
                i=i+1
        return diff
