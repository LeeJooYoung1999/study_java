package ch15.sec03.exam02;
//앞에서 작성한 Member 클래스를 다음과 같이 운영하고,
//올바르게 동작하는지 확인하세요.
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<Member> set = new HashSet<Member>();
        //Member 객체 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));
        //저장된 객체 수 출력
        System.out.println("총 객체 수 : " + set.size());
    }
}

//실행결과 예상
//우선, HashSet은 중복을 허용하지 않는 Set계열 자료구조이다.
//더하여, 앞에서 작성한 Member클래스를 통해, name과 age가 같다면, 같은 해쉬코드를 부여받을것이다.
//따라서, 10행, 11행에서 생성된 두 객체는 해쉬코드가 같고, equals()메소드가 true를 리턴하는 동등객체이므로,
// 출력결과 총 객체수는 1일 것으로 예상된다.

//실제 출력결과
//:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\lib\idea_rt.jar=61225:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\student\Downloads\4차 실습과제_18회차_이주영\10_java(basic)\out\production\10_java(basic);C:\Users\student\Downloads\4차 실습과제_18회차_이주영\10_java(basic)\lib\lombok.jar" ch15.sec03.exam02.HashSetExample
//총 객체 수 : 1
//
//종료 코드 0(으)로 완료된 프로세스

//=> 예상결과와 실제 출력결과가 1로 같으므로, 올바르게 동작함을 확인가능하다.