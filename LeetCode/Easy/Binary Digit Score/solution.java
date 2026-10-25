class Solution {
    int f(int n){
        int c=0;
        while(n>0){
            if(n%2==1)
            c++;
            n/=2;
        }return c;
    }
    public int calculateScore(int a, int b) {
        int e = f(a);
        int v = f(b);
        System.out.println(e+" "+v);
        if(e>=v){
            return e*v;
        }
        return v/e;
        
    }
}