package ch15.sec03.exam03;
//아래 조건(주석으로 표현)을 만족하도록 프로그램을 완성하세요.
// Iterator 패턴으로 순회하며 각 요소를 출력하세요.
// 향상된 for 문으로  순회하며 각 요소를 출력하세요.
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        //Hash컬렉션 생성
        Set<String> set = new HashSet<String>();

        //객체추가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // Iterator 패턴으로 순회하며 각 요소를 출력하세요.
        Iterator<String> iterator = set.iterator(); //반복자 생성
        while (iterator.hasNext()) {  //객체를 하나씩 순회
            System.out.println(iterator.next()); //객체 하나를 가져와서 출력
        }
        System.out.println(); //줄바꿈
        System.out.println("-------------------------");
        System.out.println(); //줄바꿈

        // 향상된 for 문으로 순회하며 각 요소를 출력하세요.
        for (String s : set) { //향상된 for문 이용해, 객체하나씩 순회
            System.out.println(s);
        }
    }
}
