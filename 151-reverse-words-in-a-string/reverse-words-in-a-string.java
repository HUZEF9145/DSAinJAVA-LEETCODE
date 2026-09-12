class Solution {
    public String reverseWords(String s) {

        int n = s.length();
        int j = n - 1;

        StringBuilder sb = new StringBuilder();

        while (j >= 0) {

            // Skip spaces
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            if (j < 0)
                break;

            int i = j;

            // Find beginning of word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Add word
            sb.append(s.substring(i + 1, j + 1));
            sb.append(" ");

            j = i;
        }

        return sb.toString().trim();
    }
}