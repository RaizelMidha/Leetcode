class Solution(object):
    def maxProfit(self, num):
        """
        :type prices: List[int]
        :rtype: int
        """
        curr_low=num[0]
        curr_high=num[0]
        curr_diff=0
        biggest_dif = 0


        for i in range(len(num)-1):
            if(curr_high<num[i+1]):
                curr_diff=num[i+1]-curr_low
                curr_high=num[i+1]
                if curr_diff > biggest_dif:
                    biggest_dif=curr_diff
                    i=i+1
                    continue
            if(num[i+1] < curr_low):
                curr_low=num[i+1]
                curr_diff=0
                curr_high=num[i+1]
            i=i+1
        return biggest_dif                


            
        