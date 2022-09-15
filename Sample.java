class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        
        if(pattern.length()!=str.length)
        {
            return false;
        }
        HashMap<Character,String> hm= new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c= pattern.charAt(i);
            if(!hm.containsKey(c) && !hm.containsValue(str[i]))
            {
              hm.put(c,str[i]);  
            }
            else if(!str[i].equals(hm.get(c)))
            {
               return false;
            }
          

        }
         return true;
        
    }
    
    
}
