class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length()-1; i >= 0 ; i--) {
            answer = answer + my_string.charAt(i);
            System.out.println(answer);
            // charAt()는 문자열을 뽑아내는 함수
        }
        return answer;
    }
}