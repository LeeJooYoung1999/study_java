package ch13.sec03.exam01;
//앞에서 정의한 Box클래스를 이용하여 제네릭 메소드 boxing을 추가하시오.
public class GenericExample {
    //boxing 제너릭 메소드 정의
    public static <T> Box<T> boxing(T t){  //제네릭메소드 정의부분 문법 = "타입파라미터정의" + "리턴타입" + "메소드명"(매개변수 ...){}
        Box<T> box = new Box<T>(); //T타입을 갖는 객체 box를 생성
        box.set(t); //전달된 값을 box객체에 저장 ( by setter)
        return box; //제네릭메소드의 반환부
    }
    //boxing 제너릭 메소드 정의 End
    
    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100); //타입T = Integer인 객체 Box생성하여 box1에 저장.
        int intvalue = box1.get(); //저장된 integer값 100꺼내어 변수 intvalue에 저장.
        System.out.println(intvalue); //출력

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}

//제시된 결과
//100
//홍길동