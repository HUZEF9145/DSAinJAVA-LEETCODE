class Solution {

    public boolean isDigit(char c){
        return c >= '0' && c<='9';

    }
    public int myAtoi(String s) {
        // " -042"
        // "1337c0d3"
        // "0-1"
        // "words and 987"
        long num = 0;
        int sign = 1;  // assuming positivity if niether is present 
        int i = 0;


        while (i<s.length() &&s.charAt(i)==' ' ){
            i++;
        }

        if (i<s.length()){
            if ( s.charAt(i)=='-'){
                sign = -1;
                i++;
            }

            else if (  s.charAt(i) == '+'){
                sign = 1;
                i++;
            }
            
        }

        while(i<s.length() && isDigit(s.charAt(i))){
            int digit = s.charAt(i)- '0';
            
            

            if (num == Integer.MAX_VALUE/10){
                if ( sign == 1 && digit >=7) return Integer.MAX_VALUE;
                else if ( sign == -1 && digit <=-8) return Integer.MIN_VALUE;
            }

            if (num > Integer.MAX_VALUE/10){
                if ( sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }



            //max value of int is 2147483647 to -2147483648 and we need to round it 
            num = num *10 + digit ;
            i++;
        }







       if (num*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
       else if (num *sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) (sign * num) ;
    }
}