package ch07.sec08.exam01;
//Tire로부터 상속받은 HankookTire
public class HankookTire extends Tire {
    @Override
    public void roll() {
        System.out.println("한국 타이어가 회전합니다.");
    }
}
