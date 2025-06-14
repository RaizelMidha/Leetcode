class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int left= 0;
        int right = n-1;
        int top= 0;
        int bottom = n-1;
        int val = 1;

        while(val <= n*n){
            // filling value in row1
            for(int c = left; c <= right;c++){
                mat[top][c] = val;
                val += 1;
            }
            top += 1;
                
            

            // filling value in LAST COLUMN 
            for(int c =top; c<= bottom;c++){
                mat[c][right] = val;
                val += 1;
            }
            right -= 1;

            // filling value in row1
            for(int c = right; c >= left;c = c-1){
                mat[bottom][c] = val;
                val += 1;
            }
            bottom -= 1;
                
            

            // filling value in LAST COLUMN 
            for(int c =bottom; c>= top;c--){
                mat[c][left] = val;
                val += 1;
            }
            left += 1;
        }

        return mat;    

    }
}