package ch04.exam;
//주어진 배열 항목에서 최대값을 출력하는 코드를 작성하세요.(for문 이용.)
//int[] array = {1,5,3,8,2};
public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2};
        int max = arr[0]; // 초기값을 배열의 첫 번째 요소로 설정
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("최대값: " + max);
    }
}
