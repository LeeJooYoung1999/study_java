package ch08.sec04;
//앞에서정의한RemoteControl 인터페이스를구현하는Audio 클래스를정의하세요.
public class Audio implements RemoteControl {
    //필드선언부
    private int volume;

    //turnOn() 추상메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    //turnoff() 추상메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    //볼륨조절용 setVolume() 추상메소드 오버라이딩
    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
        }
        System.out.println("현재 Audio볼륨: " + volume);
    }
}
