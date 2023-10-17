class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] letterOne = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int a = 97;
        for(int i = 0; i < letterOne.length; i++) { // letterOne
            for(int j = 0; j < morse.length; j++) { // morse
                if(letterOne[i].equals(morse[j])) { // morse랑 letterOne이 같을 경우 글자로 출력
                    System.out.println("morse:"+morse[j]);
                    answer += (char) (j + a); // 소문자 a는 97로 이에 j의 값을 더하면 ab... 
                }
            }
            
        }
        return answer;
    }
}