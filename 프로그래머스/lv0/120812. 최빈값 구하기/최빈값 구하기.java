class Solution {
    public int solution(int[] array) {
        // 변수 초기화
        // 최대 정수
        int[] cnt = new int[1000]; 
        // 최대 등장 횟수
        int max = Integer.MIN_VALUE; // Integer.MIN_VALUE는 가장 작은 정수값
        // 가장 많이 나오는 숫자 저장
        int answer = 0; 
        
        // 등장한 횟수 누적
        for(int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }
        //
        for(int i = 0; i < cnt.length; i++) {
            // 가장 많이 등장한 숫자 기록
            if(cnt[i] > max) { // 등장 횟수가 누적 횟수보다 클때는 등장 횟수 갱신
                max = cnt[i];
                answer = i;
            }
            // 중복 될 경우 -1
            else if(cnt[i] == max) {
                answer = -1;
            }
        }
        return answer;
    }
}