class Solution {
    public int solution(int slice, int n) {
        int answer = 2;
        if(n % slice == 0){
            answer = n / slice;
            System.out.println(answer);
        } else {
            answer = n / slice + 1;
        }
       
        return answer;
    }
}