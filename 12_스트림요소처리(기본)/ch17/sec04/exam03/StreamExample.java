package ch17.sec04.exam03;
//1에서 100까지의 합을 구하고, 다음과 같이 출력하세요.
import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;  // 합계를 구하기 위한 변수
    public static void main(String[] args) {
        IntStream intstream = IntStream.rangeClosed(1,100); //int 범위를 스트림으로 처리하는 메소드 IntStream.rangeClosed()
        intstream.forEach(num -> sum+=num);
        System.out.println("총합: " + sum);
    }
}

//제시된 출력
//총합: 5050