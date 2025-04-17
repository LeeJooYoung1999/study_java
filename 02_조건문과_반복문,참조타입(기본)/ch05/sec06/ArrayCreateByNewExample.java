package ch05.sec06;
//다음 조건을 처리하는 프로그램을 작성하세요.
//정수요소 3개를 갖는 정수배열 arr1을 선언 및 생성하고,(초기화X) 그 arr1배열의 내용을 출력할것.
//문자열요소 3개를 갖는 문자열배열 arr2을 선언 및 생성하고,(초기화X) 그 arr2배열의 내용을 출력할것.
public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        //정수요소 3개를 갖는 정수배열 arr1을 선언 및 생성(new0
        int[] arr1 = new int [3];
        //arr1의 내용을 출력(초기화X)
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);  //초기화하지 말랬으니, 정수요소의 기본값0으로 출력.
        }
        //문자열요소 3개를 갖는 문자열 배열 arr2를 선언 및 생성
        String[] arr2 = new String [3];
        //arr2의 내용을 출력(초기화X)
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]); //마찬가지로, 문자열요소의 기본값 null로 출력될 것으로 예상됨.
        }

    }
}