package ch16.sec05.exam03;
//생성자 참조를 이용하여 다음과 같이 출력되도록 수정하세요.
// - Person의 getMember1/2 메서드를 이용하여 Member를 생성함.

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person(); //우선 Person객체를 생성

        Member m1 = person.getMember1(Member :: new); // 생성자를 참조할 때는 클래스 이름뒤에 ::기호를 붙이고, new연산자를 기술한다.
        System.out.println(m1);
        System.out.println(); //줄바꿈

        Member m2 = person.getMember2(Member::new); //
        System.out.println(m2);
    }
}

//제시된 출력
//Member(String id)
//{ id: winter, name: null }
//
//Member(String id, String name)
//{ id: winter, name: 한겨울 }