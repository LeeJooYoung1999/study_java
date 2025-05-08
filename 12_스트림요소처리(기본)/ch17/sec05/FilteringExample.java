package ch17.sec05;
//다음과 같이 출력되도록 코드를 완성하세요.
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExample {
    public static void main(String[] args) {
        //리스트 생성(ArrayList컬렉션)
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        //중복요소제거 -> 중복요소를 제거하는 메소드는 distinct()
        list.stream()
            .distinct()
            .forEach(name->System.out.println(name));
        System.out.println(); //줄바꿈

        //신으로 시작하는 요소만 필터링 -> 사용자정의 조건을 필터링하는 메소드는 filter()
        list.stream()
            .filter(name -> name.startsWith("신"))
            .forEach(name -> System.out.println(name));
        System.out.println(); //줄바꿈

        //중복요소를 먼저 제거하고, 신으로시작하는 요소만 필터링
        list.stream()
                .distinct()
                .filter(name->name.startsWith("신"))
                .forEach(name -> System.out.println(name));
    }//psvm
}//class
