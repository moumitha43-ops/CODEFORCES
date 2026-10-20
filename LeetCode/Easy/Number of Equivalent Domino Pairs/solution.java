class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int maxi = Integer.MIN_VALUE; 
        int sum=0;
        for(int i=0;i<dominoes.length;i++){
            int c;
            if(dominoes[i][0]<=dominoes[i][1]){
                c = dominoes[i][0];
                c=c*10+(dominoes[i][1]);
            }
            else{
                c = dominoes[i][1];
                c=c*10+(dominoes[i][0]);
            }
            mp.put(c,mp.getOrDefault(c,0)+1);
            if(mp.get(c)>maxi){
                maxi=mp.get(c);
            
            }
        }
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            int m = e.getValue();
            sum+=(m*(m-1))/2;
        }
        return sum;
    }
}