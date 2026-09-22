class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        for (int pile : piles) {
            if (max < pile)
                max = pile;
        }

        int low = 1;
        int high = max;
        int answer = max;

        while (low <= high) {
            int i = low + (high - low) / 2;
            long hours = 0;


            for (int pile : piles) {
                hours += (pile + i - 1) / i;
            }

            if (hours <= h) {
                answer = i;
                high = i - 1;
            } 
            else {
                // i is too slow, need a faster speed
                low = i + 1;
            }
        }

        return answer;
    }
}