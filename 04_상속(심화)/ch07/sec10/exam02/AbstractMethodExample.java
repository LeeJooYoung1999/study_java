package ch07.sec10.exam02;
//앞에서 정의한 클래스를 이용하여,다음 출력이 나오도록 코드를 완성하세요.
public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());
    }
    public static void animalSound(Animal animal) {
        animal.sound();
    }
}

//제시된 출력
//멍멍
//야옹
//멍멍
//야옹