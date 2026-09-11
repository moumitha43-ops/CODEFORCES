class Solution {
    public int generateKey(int num1, int num2, int num3) {
       List<Integer> l = new ArrayList<>();
       int c = 0;
       while(num1>0 || num2>0 ||num3>0){
        l.add(Math.min(num1%10,Math.min(num2%10,num3%10)));
        num1/=10;
        num2/=10;
        num3/=10;
       } 
       Collections.reverse(l);
       for(int n:l){
        c=c*10+n;
       }
       return c;
    }
}