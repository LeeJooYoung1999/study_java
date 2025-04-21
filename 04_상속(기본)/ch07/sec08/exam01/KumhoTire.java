package ch07.sec08.exam01;
//Tire로부터 상속받은 KumhoTire
public class KumhoTire extends Tire {
    @Override
    public void roll() {
        System.out.println("금호 타이어가 회전합니다.");
    }
}
