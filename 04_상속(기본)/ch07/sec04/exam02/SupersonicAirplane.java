package ch07.sec04.exam02;
//다음 클래스들을 정의하세요 -  SupersonicAirplane클래스(사전작성한 Airplane클래스를 상속하는 클래스임.)
public class SupersonicAirplane extends Airplane {
    //일반속도상수 NORMAL 정의
    public static final int NORMAL = 1;  //변경을 금지하는 final과, 클래스차원에서 공유하는 요소를 정의하는 static을 동시에 사용하여, 상수를 정의.
    //초음속상수 SUPERSONIC 정의
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;  //주행모드flyMode의 초기값을 NORMAL로 설정.

    @Override
    public void fly() {
        if(flyMode == SUPERSONIC){
            System.out.println("초음속 비행합니다.");
        }else {
            super.fly();  //plane클래스에서 정의된 바로는, "일반 비행합니다"를 출력하는 메소드임.
        }
    }
}
