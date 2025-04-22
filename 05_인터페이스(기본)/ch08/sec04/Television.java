package ch08.sec04;
//앞에서정의한RemoteControl 인터페이스를구현하는Television 클래스를정의하세요.
// setVolume() 메서드
//매개변수volume 값으로필드volume 값으로설정
//매개변수volume 값이최대볼륨보다큰값이면최대볼륨으로설정
//최소볼륨보다작은값이면최소볼륨으로설정
// "현재TV 볼륨: 값" 출력

public class Television implements RemoteControl{
    //필드 선언부
    private int volume;

    //turnOn() 추상메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    //turnOff() 추상메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }
    //setVolume() 추상메소드 오버라이딩

    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME){
            volume = MAX_VOLUME;  //volume 값이 최대볼륨보다 큰값이면 최대볼륨으로 설정
        } else if(volume < MIN_VOLUME){
            volume = MIN_VOLUME;  //최소볼륨보다작은값이면최소볼륨으로설정
        }
        System.out.println("현재 TV볼륨: " + volume);
    }
}
