class Solution {
    public String solution(int age) {
        String answer = "";
         // 23
        String age962 = "abcdefghij";
        String[] strAge = String.valueOf(age).split(""); // split은 자르기
        for(int i = 0; i < strAge.length; i++) {
            answer += age962.charAt(Integer.valueOf(strAge[i]));
            // charAt은 ()안에 해당하는 글자만빼서 char로 변경
            // charAt()할때 괄호 안에는 Int만 들어갈 수 있음
            // Integer.valueOf(strAge[i])는 string으로 변경한 age를 다시 int로 변경 
        }
        return answer;
    }
}