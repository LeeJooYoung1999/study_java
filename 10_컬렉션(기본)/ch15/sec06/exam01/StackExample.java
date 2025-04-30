package ch15.sec06.exam01;

import java.util.Stack;

//스택을 이용하여 다음순서대로 추가하고, 스택이 빌때까지 하나씩 뽑으면서 해당요소를 출력하시오
// ○ 추가 순서 Coin 100, 50, 500, 10
public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinStack = new Stack<Coin>(); //Stack컬렉션 생성

        //주어진 순서대로 동전넣기(추가하기)
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(10));

        //스택이 빌때까지 하니씩 뽑으며, 해당요소 출력하기
        while (!coinStack.isEmpty()) {  //스택이 빌때까지
            Coin coin = coinStack.pop(); //동전 하나씩 뽑으며,
            System.out.println("꺼내온 동전 : "+coin.getValue()+"원"); //해당요소 출력하기
        }
    }
}

//제시된 출력
//꺼내온 동전 : 10원
//꺼내온 동전 : 500원
//꺼내온 동전 : 50원
//꺼내온 동전 : 100원

//실제 출력
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\lib\idea_rt.jar=61627:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\student\Downloads\4차 실습과제_18회차_이주영\10_java(basic)\out\production\10_java(basic);C:\Users\student\Downloads\4차 실습과제_18회차_이주영\10_java(basic)\lib\lombok.jar" ch15.sec06.exam01.StackExample
//꺼내온 동전 : 10원
//꺼내온 동전 : 500원
//꺼내온 동전 : 50원
//꺼내온 동전 : 100원
//
//종료 코드 0(으)로 완료된 프로세스