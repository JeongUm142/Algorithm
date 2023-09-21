class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1]; // 답의 길이는 끝 인덱스 - 첫 인덱스 + 1(0부터 시작으로)
        int j = 0; // for문이 돌면서 계속 커질 예정
        for(int i = num1; i <= num2; i++) {
            System.out.println("성공");
            answer[j] = numbers[i]; // answer[0] = numbers[1] => 0 = 2 // answer[1] = numbers[2] => 1 = 3 ---
            j++; // for문이 한 번 돌때마다 +1 
        }
        return answer;
    }
}