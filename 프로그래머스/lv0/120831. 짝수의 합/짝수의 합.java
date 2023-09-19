class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) { // i를 2로 나눴을때 0이면 짝수 , 그렇지 않으면 홀수
                answer += i; // 값을 누적
                System.out.println(i + "짝수");
            }
        }
       
        return answer;
    }
}