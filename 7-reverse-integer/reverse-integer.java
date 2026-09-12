class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x!=0){
            //x = 123
            int digit = x%10;
            if (rev>Integer.MAX_VALUE/10) return 0;
            if (rev == Integer.MAX_VALUE/10 && digit>7) return 0;

            if (rev<Integer.MIN_VALUE/10) return 0;
            if (rev == Integer.MIN_VALUE/10 && digit<-8) return 0;



            // 3
            rev = rev *10 + digit;
        
        
            x= x/10;
            //x = 12 

        } return rev ;
        
    }
}