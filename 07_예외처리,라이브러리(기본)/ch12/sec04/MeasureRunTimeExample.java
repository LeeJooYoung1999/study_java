package ch12.sec04;
// 1부터 1000000까지의 합을 구하는 프로그램을 작성하고, 계산결과와 계산에 소요된 시간을
// nano초 단위로 출력하세요.
public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long startTime = System.nanoTime();  //시작시각 설정
        //1부터 1000000까지의 합연산 코드
        int sum = 0;
        for (int i = 1; i <= 100000; i++) {
            sum += i;
        }
        long endTime = System.nanoTime();  //종료시각 설정

        System.out.println("계산결과: "+sum);
        System.out.println("계산에 소요된 시간(nano초): "+(endTime - startTime)); //소요시간 = 종료시각 - 시작시각
    }
}
