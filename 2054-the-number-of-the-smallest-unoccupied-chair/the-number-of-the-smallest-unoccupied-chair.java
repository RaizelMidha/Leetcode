class Solution {
    public void pr(int[] arr)
    {
        for(int i =0;i<arr.length;i++)
        System.out.print(arr[i]+",");
    }
    public int smallestChair(int[][] times, int targetFriend) {
        int[] chairs = new int[times[targetFriend][0]];
        for(int i = 0; i<chairs.length; i++){
            chairs[i] = 0;
        }
        for(int i = 0; i < times.length; i++) {
            if(times[i][0] < times[targetFriend][0]) {
                chairs[times[i][0]-1] = times[i][1]-1;
            } 
        }
        //pr(chairs);
        for(int i = 0; i < chairs.length; i++) {
            for(int j = 0; j < i; j++){
                if(chairs[j] <= i){// && chairs[j] !=0 && chairs[i] !=0){
                    //System.out.println("Replacing "+i+":"+chairs[i]+":"+j+":"+chairs[j]);
                    chairs[j] = chairs[i];
                    chairs[i] = 0;
                    if(i == chairs.length - 1){
                        return j; 
                    }
                    break;
                }
            }
        }

        return chairs.length - 1;
    }
}