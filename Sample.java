import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hm= new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            String word=strs[i];
            char[] charArr=word.toCharArray();
            Arrays.sort(charArr);
            String q=new String(charArr);
            if(!hm.containsKey(q))
            {
                
                
                hm.put(q,new ArrayList<>());
            }
            hm.get(q).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
        
    }
}
