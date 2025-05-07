package ch16.sec02.exam01;
//앞에서 정의한 인터페이스 Wokrkable과 클래스 Person을 이용해 아래 코드를 완성하세요.

import java.security.spec.RSAOtherPrimeInfo;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //실행문이 두개 이상인 경우, 중괄호 필요 = 중괄호가 있으니, 실행문 2개를 얘가 갖는다는 것.
        person.action(()->{
            //실행문1
            System.out.println("출근을 합니다.");
            //실행문2
            System.out.println("프로그래밍을합니다.");
        });
        //실행문이 한개일경우, 중괄호 생략가능.
        person.action(()->{
           //실행문3
            System.out.println("퇴근합니다.");
        });
    }//psvm
}//class

//제시된 출력  -> 실행문이 3개
//출근을 합니다.
//프로그래밍을 합니다.
//퇴근합니다.