package ch08.sec02;
//앞에서정의한인터페이스와클래스를이용하여다음과같이출력되도록완성하세요.
public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;   //인터페이스 RemoteControl를 이용해 변수rc정의
        rc = new Television();  //인터페이스를 통해 정의한 rc에 Television객체 대입
        rc.turnOn();

        rc = new Audio(); //rc에 Audio객체로 교체 대입
        rc.turnOn();
    }
}
