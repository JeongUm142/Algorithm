class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String answerArr[] = my_string.split(""); // 한글자씩
         // answerArr = [h] [e] [l] [l] [o]
        for(int i = 0; i < my_string.length(); i++) {
            // repeat(반복횟수)함수 ->n만큼 반복해 붙인 새로운 문자열을 반환
            answer += answerArr[i].repeat(n); 
        }
        return answer;
    }
}