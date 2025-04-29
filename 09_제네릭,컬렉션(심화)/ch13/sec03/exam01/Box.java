package ch13.sec03.exam01;
//다음 Box클래스를 정의하시오.
public class Box<T> { //Box클래스가 타입파라미터T로 정의된 제네릭타입임을 확인가능.
    //필드
    private T t;  //T타입의 데이터를 저장할 필드 t를 private으로 정의 => get 또는 set이 아니면 접근할수 없도록 정보은닉.

    //메소드
    //get
    public T get(){return t;} //T타입의 데이터반환하는 get메소드 정의
    //Set
    public void set(T t){this.t = t;} //T타입의 데이터를 저장하는 set메소드 정의
}
