class Solution {
    public int minLength(String s) {

       
        StringBuffer str = new StringBuffer(s);
       

        for(int i =str.length()-1;i>=1;i--)
        {
            if((str.charAt(i-1) == 'A' && str.charAt(i) == 'B') || (str.charAt(i-1) == 'C' && str.charAt(i) == 'D'))
            {
                str.delete(i-1, i+1);
                if(i == str.length()+1)
                    i--;
            }
        }
        return str.length();
    }
}