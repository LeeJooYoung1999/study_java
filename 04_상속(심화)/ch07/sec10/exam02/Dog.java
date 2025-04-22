package ch07.sec10.exam02;
// Animal 클래스를 상속받아 완전한 Dog 클래스를 정의하세요.
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
