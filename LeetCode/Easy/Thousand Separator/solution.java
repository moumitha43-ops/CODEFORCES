class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        if(n==0){
            return "0";
        }
        while(n>0){
            if(c==3 && n>0){
                sb.append('.');
                c=0;
            }
            sb.append((n%10));
            n/=10;
            c++;

        }
        return sb.reverse().toString();
    }
}