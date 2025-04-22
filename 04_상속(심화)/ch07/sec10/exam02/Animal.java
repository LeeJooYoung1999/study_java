package ch07.sec10.exam02;
//다음 클래스에 리턴값이 없는 추상 메서드 sound()를 추가하세요.
public abstract class Animal {
    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }
    public abstract void sound();
}
