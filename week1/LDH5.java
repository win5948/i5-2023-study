class Solution {
    public int solution(int a, int b) {
        b = b / GCD(a, b);
        
        while(b != 1) {
            if(b % 2 == 0) b = b / 2;
            else if(b % 5 == 0) b = b / 5;
            else return 2;
        }
        
        return 1;
    }
    
    public int GCD(int a, int b) {
        if(b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
