package ch15.sec04.exam01;
//다음 프로그램을 완성하시오.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>(); //Key의 타입은 String, Value의 타입은 Integer을 갖는 Map컬렉션 생성.

        //객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수: " + map.size()); //총 엔트리 수 = 저장된 키의 총수
        System.out.println(); //줄바꿈

        //키로 값 얻기
        String key = "홍길동"; //키 초기값 선언
        int value = map.get(key); //키를 매개값으로 값을 리턴.
        System.out.println(key + ": " + value);
        System.out.println(); //줄바꿈

        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println(); //줄바꿈

        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println(); //줄바꿈

        //키로 엔트리 삭제
        map.remove("홍길동");

        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
    }
}

//실제 출력결과
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\lib\idea_rt.jar=61316:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\student\Downloads\4차 실습과제_18회차_이주영\10_java(basic)\out\production\10_java(basic);C:\Users\student\Downloads\4차 실습과제_18회차_이주영\10_java(basic)\lib\lombok.jar" ch15.sec04.exam01.HashMapExample
//총 Entry 수: 3
//
//홍길동: 95
//
//홍길동 : 95
//신용권 : 85
//동장군 : 80
//
//홍길동 : 95
//신용권 : 85
//동장군 : 80
//
//총 Entry 수: 2
//
//
//종료 코드 0(으)로 완료된 프로세스