class Solution {
    public String solution(String my_string, String letter) {
        // replace(기존, 바꿀문자) 함수 사용하여 letter을 ""(공백)로 변경한다
        String answer = my_string.replace(letter, "");
        
        return answer;
    }
}