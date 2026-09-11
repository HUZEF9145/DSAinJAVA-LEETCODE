class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        HashMap <Character,Integer> hm1 = new HashMap<>();
        int i =0 ;
        while(i<s.length() ){
            if (hm1.containsKey(s.charAt(i))){
                hm1.put(s.charAt(i),hm1.get(s.charAt(i))+1);
            }
           else  hm1.put(s.charAt(i), 1);

            i++;


        }


         HashMap <Character,Integer> hm2 = new HashMap<>();
        int j =0 ;
        while(j<t.length() ){
            if (hm2.containsKey(t.charAt(j))){
                hm2.put(t.charAt(j),hm2.get(t.charAt(j))+1);
            }
           else  hm2.put(t.charAt(j), 1);

            j++;


        }

        if (hm1.equals(hm2)) return true;
        return false;


        
    }
}