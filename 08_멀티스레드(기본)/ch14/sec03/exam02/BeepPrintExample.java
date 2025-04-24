package ch14.sec03.exam02;
//다음에 정의한 두 작업을 각각의 스레드에서 수행하도록 프로그램을 작성하세요.
//작업1: 0.5초 간격으로 비프음을 출력  -   Runnable 인터페이스를이용하여 작업 스레드에서 실행
//작업2: 0.5초 간격으로 "띵" 문자열 출력  -  Main 스레드에서 실행
import java.awt.*; // Toolkit 클래스를 사용하기 위해 AWT 패키지 임포트

// Runnable 인터페이스를 구현하는 클래스 (비프음 출력 작업을 수행)
class BeepTask implements Runnable {
    @Override
    public void run() { // 작업 스레드에서 실행할 코드 정의
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 시스템에서 비프음을 발생시키는 Toolkit 객체 생성
        for (int i = 0; i < 5; i++) { // 비프음을 5번 반복 출력
            toolkit.beep(); // 비프음 발생
            try {
                Thread.sleep(500); // 0.5초 동안 대기 (비프음 간격 조절)
            } catch (Exception e) {}
        }
    }
}

public class BeepPrintExample {
    public static void main(String[] args) { // 프로그램 시작 (메인 스레드 실행)
        // 작업 스레드 생성 (Runnable 구현 객체를 Thread 생성자에 전달)
        Thread thread = new Thread(new BeepTask());
        thread.start(); // 작업 스레드 실행 -> 비프음 출력이 병렬적으로 수행됨

        // 메인 스레드에서 "띵" 문자열 출력
        for (int i = 0; i < 5; i++) { // 5번 반복 실행
            System.out.println("띵"); // 콘솔에 "띵" 출력
            try {
                Thread.sleep(500); // 0.5초 동안 대기 (출력 간격 조절)
            } catch (Exception e) {}
        }
    }
}
