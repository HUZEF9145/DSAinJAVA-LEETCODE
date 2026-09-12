class Solution {
    public String reverseWords(String s) {

        int n = s.length();
        int j = n - 1;

        StringBuilder sb = new StringBuilder();

        while (j >= 0) {
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            if (j < 0)
                break;

            int i = j;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            
            sb.append(s.substring(i + 1, j + 1));
            sb.append(" ");

            j = i;
        }

        return sb.toString().trim();
    }
}