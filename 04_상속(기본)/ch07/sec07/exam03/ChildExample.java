package ch07.sec07.exam03;
//앞의 두클래스(Parent, Child)를 다음과 같이 운영했을때,
//잘못된 부분을 찾아 수정하세요.
public class ChildExample {
    public static void main(String[] args){
        Parent parent = new Parent();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        //parent.field2 = "data2";
        //parent.method3();

        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
//잘못된 코드 11행의 parent.field2 = "data2";와,
//          12행의 parent.method3();이다.
//이유는, parent 클래스에는 field2라는 필드도, method3라는 메소드도 선언되어 있지 않기 때문이다.
