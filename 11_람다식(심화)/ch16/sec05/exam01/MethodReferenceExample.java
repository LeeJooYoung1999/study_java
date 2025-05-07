package ch16.sec05.exam01;
//메소드 참조를 이용하여 다음과 같은 결과가 나오도록 완성하세요
public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        //정적메소드일 경우
        //람다식
        //person.action((x,y)->Computer.staticMethod(x,y));
        //메소드참조
        person.action(Computer :: staticMethod); //정적 메소드를 참조할 경우에는 이름뒤에 ::기호를 붙이고,정적메소드 이름을 기술한다.

        //인스턴트 메소드일 경우
        Computer comp = new Computer();  //우선 객체를 생성
        //람다식
        //
        //메소드참조
        person.action(comp :: instanceMethod); //인스턴트 메소드를 참조할 경우에는 우선 객체를 생성한후(14행) 참조변수뒤에 ::기호를 붙이고, 인스턴스 메소드 이름을 기술한다.
    }
}

//제시된 출력
//결과: 14.0
//결과: 40.0