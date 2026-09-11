class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        HashMap <Character,Integer> hm = new HashMap<>();
        int i =0 ;
        while(i<s.length() ){
            if (hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
           else  hm.put(s.charAt(i), 1);

            i++;


        }


        
        int j =0 ;
        while(j<t.length() ){
            if (hm.containsKey(t.charAt(j))){
                hm.put(t.charAt(j),hm.get(t.charAt(j))-1);
            }
           

            j++;


        }

        for ( int value : hm.values()){
            if (value!=0)return false;
        }
        return true;


        
    }
}