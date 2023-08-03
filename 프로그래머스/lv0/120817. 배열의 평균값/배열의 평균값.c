#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
double solution(int numbers[], size_t numbers_len) {
    double answer = 0;
    int total=0; // 배열내에 모든 값을 담을 변수
    for(int i=0; i < numbers_len; i++) {
       total+=numbers[i];
    }
    answer = (double)total / numbers_len;
    return answer;
}