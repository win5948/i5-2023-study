class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length ; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    
                    boolean isPrime = true;
                    for(int l = 2; l < sum; l++) {
                        if(sum % l == 0) { // 2부터 sum-1까지 약수가 존재하면 isPrime을 false로 변경하고 해당 반복문을 빠져나온다.
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime) answer++; // isPrime이 true라면 위의 if문에 걸리지 않은 것이므로 소수이다.
                }
            }
        }

        return answer;
    }
}
