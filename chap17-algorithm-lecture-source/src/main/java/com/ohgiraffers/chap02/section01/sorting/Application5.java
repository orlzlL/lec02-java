package com.ohgiraffers.chap02.section01.sorting;

public class Application5 {
    public static void solution(int low, int high, int[] arr) {

        int[] temp = new int[high + 1];

        if(high - low == 0) return;

        int median = low + (high - low) / 2;

        solution(low, median, arr);
        solution(median + 1, high, arr);

        /* 설명. 정렬 전 temp에 배열 복사 */
        temp = arr.clone();

        /* 설명. 분할 정복 방식으로 작은 값부터 값을 쌓음 */
        int k = low;
        int index1 = low;
        int index2 = median + 1;

        /* 설명. 두 인덱스가 가르치는 값들을 비교하고 하나라도 분할 구역의 끝을 만나면 멈추는 반복문 실행 */
        while(index1 <= median && index2 <= high) {
//            if(temp[index1] > temp[index2]) {     // 오름차순
            if(temp[index1] < temp[index2]) {       // 내림차순
                arr[k] = temp[index2];
                k++;
                index2++;
            } else {
                arr[k] = temp[index1];
                k++;
                index1++;
            }
        }

        /* 설명. 좌측 인덱스 마저 옮기기 */
        while(index1 <= median) {
            arr[k] = temp[index1];
            k++;
            index1++;
        }

        /* 설명. 우측 인덱스 마저 옮기기 */
        while(index2 <= high) {
            arr[k] = temp[index2];
            k++;
            index2++;
        }
    }
}