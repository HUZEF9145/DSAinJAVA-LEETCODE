class Solution {
    public int firstUniqChar(String s) {
        Map <Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // int count = 0;
        //  for (char ch : map.keySet() ){
        //  count +=map.get(ch);
            
        //     if (map.get(ch)==1){
        //         return count;
        //     }
        //  }

        for (int i=0; i<s.length(); i++){
            if (map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
        
    }
}