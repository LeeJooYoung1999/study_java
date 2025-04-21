package ch07.sec07.exam02;
//ChildExample에서 잘못된 코드를 찾고, 그이유를설명하세요.
public class ChildExample {
    public static void main(String[] args) {
        Child child= new Child();
        Parent parent= child;
        parent.method1();
        parent.method2();
        //parent.method3(); //-- 출력불가능
    }
}

//코드중 잘못된 부분의 이유설명
//위 코드에서 출력이 불가능한 부분은 9행의 parent.method3();이다.
//이는 method3()이 부모클래스에 없는 메소드이기 때문이다.
//따라서, 강제형변환을 통해 부모 ->자식으로 형변환해줘야 정상출력된다.