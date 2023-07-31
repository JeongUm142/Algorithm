class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2]; // 전체 배열 중 홀수만 필요하기에 /2
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                answer[i/2] = i; // /2를 통해 배열 인덱스 결정
            }
        }
        return answer;
    }
}