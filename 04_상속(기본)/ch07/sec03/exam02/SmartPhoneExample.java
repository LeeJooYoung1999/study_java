package ch07.sec03.exam02;
//SmartPhoneExample클래스로 SmartPhone의 인스턴스를 생성하여 초기화가 올바른지 확인하세요.
public class SmartPhoneExample {
    public static void main(String[] args){
        SmartPhone sm  = new SmartPhone("갤럭시 s24", "은색");  //객체생성
        System.out.println("모델은 "+sm.model);    //상속받은 필드1
        System.out.println("색상은 "+sm.color);    //상속받은 필드2
    }
}
