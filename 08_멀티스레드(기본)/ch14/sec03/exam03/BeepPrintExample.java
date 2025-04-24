package ch14.sec03.exam03;
//다음에 정의한 두 작업을 각각의 스레드에서 수행하도록 프로그램을 작성하세요.
//작업1: 0.5초 간격으로 비프음을 출력  -  Thread클래스의 상속을 이용하여 작업 스레드에서 실행
//      익명객체를 이용하여 작성.
//작업2: 0.5초 간격으로 "띵" 문자열 출력  -  Main 스레드에서 실행

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {    //main()메소드와 함께, 메인스레드 실행.
        // 작업1: Thread 클래스를 상속받은 익명 객체를 이용해 비프음 출력----------//
        Thread thread = new Thread() {   //Thread클래스로부터, 작업스레드객체를 직접 생성
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();  //비프음을 발생시키는 기능을 포함한 Toolkit객체를 생성
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); // 비프음 출력
                    try {
                        Thread.sleep(500); // 0.5초 대기
                    } catch (Exception e) {}
                }
            }
        };
        //---------작업스레드 생성부분 끝------------------//

        //---------작업스레드 실행부분 by 메인스레드---------//
        thread.start(); //start()메소드를 통해, 13행~21행에서 재정의한 run()메소드를 실행한다.

        // 작업2: 메인 스레드에서 "띵" 출력-----------------//
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (Exception e) {}
        }
    }
}