class Solution {
    public int reverse(int x) {
        int rev = 0;
        int n = x;
        if(x<0){
            n*=-1;
        }
        while(n!=0){
            int r = n % 10;
            n /= 10;
            rev = rev*10 + r;
        }
        if(x<0){
            rev *= -1;
        }

        return rev;
    }
}


