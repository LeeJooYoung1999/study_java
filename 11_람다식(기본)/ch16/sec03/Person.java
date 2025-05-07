package ch16.sec03;

public class Person {
    //데이터 처리부1 action1 정의
    public void action1(Workable workable) {
        workable.work("홍길동", "프로그래밍"); //매개변수 2개짜리
    }

    //데이터 처리부2 action2 정의
    public void action2(Speakable speakable) {
        speakable.speak("안녕하세요"); //매개변수 1개짜리
    }
}
