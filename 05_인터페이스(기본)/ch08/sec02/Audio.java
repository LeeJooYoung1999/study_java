package ch08.sec02;
//RemoteControl인터페이스를구현하는Television, Audiot클래스를완성하세요.
public class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
}
