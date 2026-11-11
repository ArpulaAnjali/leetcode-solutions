class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int single=0;
        int doubled=0;
        for(int i=0;i<n;i++){
            if(nums[i]<10){
                single=single+nums[i];
            }
            else{
                doubled=doubled+nums[i];
            }
        }
        return single!=doubled;
    }
}