class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       
        int[] answer = new int[2];
        answer[0] = numer1*denom2 + numer2*denom1;
        answer[1] = denom1*denom2;
    
        // 최소공약수 
        int minNum = answer[1];
        System.out.println(minNum);
         if(answer[0] < answer[1]) {
            minNum = answer[0];
            System.out.println(minNum);
        }  
    
        int max = 0;
        
        for(int i = 1; i <= minNum; i++) { 
            if(answer[0]%i == 0 && answer[1]%i == 0) {
                max = i;
                System.out.println(max + "<--max1");
            }

        }

        // 간소화된 분자와 분모 구하기
        answer[0] /= max;
        answer[1] /= max;

        return answer;
    }
}