class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int aa = 5500;
        if(money >= aa) {
            answer[0] = money / aa;
            answer[1] = money % aa;
        } else {
            answer[0] = 0;
            answer[1] = money;
        }
           return answer;
    }
}