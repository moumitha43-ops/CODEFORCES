class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
            if(mp.get(c)==2)return c;
        }return '0';
    }
}