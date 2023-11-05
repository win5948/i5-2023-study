class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
            
        for(int i=0; i<k+1; i++) {
            for(int j=0; j<k+1; j++) {
                if(i+j<=k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}
