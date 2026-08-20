class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int o =0;
        int maxo=0;

        for (int i=0; i<n; i++){
            if (nums[i]==0){
                o=0;
            }
            
            else {
                o++;
                if(o > maxo){
                     maxo = o ;

                }
               

            }
        } return maxo;
        
    }
}