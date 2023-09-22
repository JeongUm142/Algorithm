class Solution {
    public int[] solution(int[] emergency) {
        int emleng = emergency.length;
        int[] answer = new int[emleng];
        
        // 나보다 큰 애 카운트하기
        for(int i = 0; i < emleng; i++) { // 나
            int lCnt = 0; // 나보다 큰 숫자 수
            for(int j = 0; j < emleng; j++) { // 비교대상
                if(j == i) { // 나랑 비교대상이 같으면
                    continue; // 다음 반복으로 계속 진행
                } 
                if(emergency[i] < emergency[j]) { // 나보다 j가 크면 lCnt + 1
                    lCnt++;
                }
            }
            // 비교대상 for문을 돌고 나온 lCnt가 1개면 나는 두번째니까 + 1
            answer[i] = lCnt + 1;
        }
        return answer;
    }
}