package ch05.sec05;
//클래스의 주석 부분을 보고,  다음과 같이 출력되도록 코드를 완성하세요
public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        // == 으로 두 변수 비교
        if(strVar1 == strVar2){
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else{
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
        // 내용으로 두 변수 비교
        if(strVar1.equals(strVar2)){
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");
        // == 으로 두 변수 비교
        if(strVar3 == strVar4){
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else{
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }
        // 내용으로 두 변수 비교
        if(strVar3.equals(strVar4)){
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}

//제시된 출력
// strVar1과 strVar2는 참조가 같음
//strVar1과 strVar2는 문자열이 같음
//strVar3과 strVar4는 참조가 다름
//strVar3과 strVar4는 문자열이 같음