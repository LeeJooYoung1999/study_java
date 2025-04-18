package ch06.sec08.exam03;
//앞에서 정의한Car 클래스를이용하여 아래와 같이 출력되도록, 운영클래스를 정의하세요.
public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car(); //객체생성
        myCar.setGas(5);   //제시된 출력값에서 제시된대로 gas의 잔량은 5로 설정.
        myCar.isLeftGas(); //gas 존재여부 확인하는 메소드 적용.
        if (myCar.isLeftGas()){  //isLeftGas의 리턴값이 true일 경우, if문 실행.
            System.out.println("출발합니다.");
            myCar.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}

//제시된 출력값
// gas가 있습니다.
//출발합니다.
//달립니다.(gas잔량:5)
//달립니다.(gas잔량:4)
//달립니다.(gas잔량:3)
//달립니다.(gas잔량:2)
//달립니다.(gas잔량:1)
//멈춥니다.(gas잔량:0)
// gas를 주입하세요.
