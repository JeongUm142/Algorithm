class Solution {
    public int solution(int n, int k) {
        // 양꼬치 n, 음료 k
        int food = 12000;
        int drink = 2000;
        
        int answer = 0;
        if(n > 0 && k > 0) {
            answer = (n * food) + (k * drink) - ((n/10)*drink); 
        }
        return answer;
    }
}