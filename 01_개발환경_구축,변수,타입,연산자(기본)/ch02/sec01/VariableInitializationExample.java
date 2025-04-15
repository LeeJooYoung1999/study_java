package ch02.sec01;
//다음 코드의 문제점을 찾아 설명해 보시오

public class VariableInitializationExample {
    public static void main(String[] args){
        int value;     //초기화 하지 않고 변수를 선언함 -> 쓰레기값 발생
        //int result = value +10;   //초기화 되지 않은 변수를 연산식에 사용하여, 컴파일 에러가 발생한다.
        //System.out.println(result);
    }
}

//이 클래스의 컴파일러 에러때문에 다른 클래스도 실행이 안되어,
// 불가피하게 주석처리 해놓았습니다.