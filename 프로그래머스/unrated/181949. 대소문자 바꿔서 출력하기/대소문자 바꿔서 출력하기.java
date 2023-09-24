import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();// 공백을 거기까지만 읽음
        String answer = "";
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)) { // 괄호안에 문자가 대문자인가?
                answer += Character.toLowerCase(c); // 괄호안에 문자를 소문자로
            } else {
                answer += Character.toUpperCase(c); // 괄호안에 문자를 대문자로
            }
        }
        System.out.println(answer);
    }
}