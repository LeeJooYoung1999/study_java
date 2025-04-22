package ch08.sec04;
//다음과 같이 인터페이스를 정의하세요.
public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
