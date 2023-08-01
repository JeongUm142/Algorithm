class Solution {
    public int solution(int n) {
        int answer = 0;
        System.out.println(n);
        if(n % 7 != 0) {
            answer = (n / 7) + 1;
            System.out.println(answer + "<--answer");
        } else {
            answer = n / 7;
        }
        
        return answer;
    }
}