package ch08.sec04;
//앞에서 정의한 인터페이스와 클래스를 이용하여 다음과 같이 출력되도록
//RemoteControlExample 클래스를 완성하세요
public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}

//제시된 출력값
//TV를 켭니다.
//현재TV 볼륨: 5
// TV를 끕니다.
// Audio를 켭니다.
//현재Audio 볼륨: 5
// Audio를 끕니다.