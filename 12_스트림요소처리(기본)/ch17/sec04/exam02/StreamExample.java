package ch17.sec04.exam02;
//아래와 같이 출력되도록 스트림을 이용한 코드를 완성하세요.
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동","신용권","김미나"}; //문자열 배열생성
        Stream<String> strStream = Arrays.stream(strArray); //strArray를 스트림형태로 변환(함수형 프로그래밍 스타일로 처리하기 위함.)
        strStream.forEach(name-> System.out.print(name+", "));
        System.out.println();//줄바꿈
        int[] intArray = {1,2,3,4,5}; //정수 배열생성
        IntStream intStream = Arrays.stream(intArray); //intArray를 스트림형태로 변환
        intStream.forEach(num->System.out.print(num+", "));

    }
}


//제시된 출력
//홍길동,신용권,김미나,
// 1,2,3,4,5,