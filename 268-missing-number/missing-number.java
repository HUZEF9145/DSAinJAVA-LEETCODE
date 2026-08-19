class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        //sum of n elements is n(n+1)/2
       int  sAll = (n*(n+1))/2;

        int sum =0 ;
        for (int i =0; i<n; i++){
            sum =sum + nums[i];
        }
        int a = sAll-sum;
        return a;
        
    }
}