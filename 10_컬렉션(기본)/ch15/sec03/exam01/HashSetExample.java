package ch15.sec03.exam01;
//다음 프로그램의 결과를 적어보고, 실제 실행을 통해 결과를 확인하세요.
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        //객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");
        //저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수: " + size);
    }
}

//위 코드의 예상결과.
//HashSet은 중복을 허용하지 않는 자료구조이므로,
//9열과 12열에서 문자열"Java"가 두번 추가되었더라도 한개만 저장될것이다.
//따라서 출력될 총 객체수는 4이다.


//실제 실행결과
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\lib\idea_rt.jar=61072:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\student\Downloads\4차 실습과제_18회차_이주영\10_java(basic)\out\production\10_java(basic);C:\Users\student\Downloads\4차 실습과제_18회차_이주영\10_java(basic)\lib\lombok.jar" ch15.sec03.exam01.HashSetExample
//총 객체 수: 4
//
//종료 코드 0(으)로 완료된 프로세스