package ch05.sec06;
//정수 요소 84, 90, 96을 가지는 배열이 있을 때, 총합과 평균을 구해 출력하세요.
public class ArrayLengthExample {
    public static void main(String[] args) {
        //정수요소 84,90,96을 갖는 배열 선언 및 생성
        int [] arr = {84,90,96};
        //총합 sum구하기 (for문 이용함)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //평균 ave = sum/3 = sum/(arr.length)
        int ave = sum / arr.length;
        //sum과 ave의 출력
        System.out.println("총합 : "+sum);
        System.out.println("평균 : "+ave);
    }
}
