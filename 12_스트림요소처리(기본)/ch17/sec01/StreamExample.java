package ch17.sec01;
//스트림을 이용하여 다음과 같이 출력하는 코드를 완성하세요.
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;
public class StreamExample {
    public static void main(String[] args) {
        //Set컬렉션 생성
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        //Stream을 이용하여 요소의 반복처리
        Stream<String> stream = set.stream(); //스트림 생성
        stream.forEach(name -> System.out.println(name)); //람다식으로 처리
    }
}

//제시된 출력
//홍길동
//신용권
//감자바