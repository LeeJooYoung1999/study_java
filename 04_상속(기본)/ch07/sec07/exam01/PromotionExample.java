package ch07.sec07.exam01;
//다음 코드에서 잘못된 코드를 찾고, 그 이유를 설명하세요.

class A {
}  //할아버지 클래스A
class B extends A {
}  //아버지1 클래스B
class C extends A {
}  //아버지2 클래스C
class D extends B {
}  //아버지1의 자식1 클래스D
class E extends C {
}  //아버지2의 자식2 클래스E


public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();  //클래스B에 의해 만들어진 인스턴스(객체)b
        C c = new C();  //클래스C에 의해 만들어진 인스턴스(객체)c
        D d = new D();  //클래스D에 의해 만들어진 인스턴스(객체)d
        E e = new E();  //클래스E에 의해 만들어진 인스턴스(객체)e

        A a1 = b;   //자식 -> 부모로 자동형변환 하는 객체b
        A a2 = c;   //자식 -> 부모로 자동형변환 하는 객체c
        A a3 = d;   //자식의자식 -> 조부모로 자동형변환 하는 객체d
        A a4 = e;   //자식의자식 -> 조부모로 자동형변환 하는 객체e

        B b1 = d;   //자식 -> 부모로 자동형변환 하는 객체d
        C c1 = e;   //자식 -> 부모로 자동형변환 하는 객체e

        //B b3 = e; //-- V 오류발생부분
        //C c2 = d; //-- V 오류발생부분
    }
}

//코드중 잘못된 부분의 이유설명
//위 코드중 잘못된 부분은 31행의 B b3 = e;과, 32행의  C c2 = d;이다.
//31행과 32행의 객체들은 부모-자식간의 형변환이 아닌, 형제간의 형변환을 시도했기 때문이다.