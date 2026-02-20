class Solution {
    public boolean isAnagram(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        int[] freq=new int[26];
        if(slen!=tlen) 
        {
            return false;
        }
        for(int i=0;i<slen;i++)
        {
         freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;
        }
        for(int count:freq)
        {
            if(count!=0)
            {
                return false;
            }
           
        }
        return true;
    }
}