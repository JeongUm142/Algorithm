import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                // i = 1 & j = 0 *
                // i = 2 & j = 0,1 **
                // i = 3 & j = 0,1,2 ***
            }
            System.out.println(""); // 줄바꿈 
        }
    }
}