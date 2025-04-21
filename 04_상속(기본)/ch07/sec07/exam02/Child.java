package ch07.sec07.exam02;
//제시된 자식클래스 Child -> parent에게 상속받음.
public class Child extends Parent {

    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }
    public void method3() {
        System.out.println("Child-method3()");
    }
}
