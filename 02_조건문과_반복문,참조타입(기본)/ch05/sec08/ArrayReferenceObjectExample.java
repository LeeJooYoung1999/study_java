package ch05.sec08;
//다음 코드의 결과를 예측해보고, 실제 결과와 비교하세요.
public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");
        System.out.println( strArray[0] == strArray[1] ); //true
        System.out.println( strArray[0] == strArray[2] ); //false
        System.out.println( strArray[0].equals(strArray[2]) ); //true
    }
}

//예측
//첫번째 출력값을 true로 예측한 이유는, strArray[0]과 strArray[1]이 같은 문자열을 참조하기 때문에,
// 같은 주소를 가질것으로 생각했기 때문이다.

//두번째 출력값을 false로 예측한 이유는, strArray[0] 과 strArray[2]는 다른 문자열(Java vs new로 새로 생성한 인스턴스)
//을 참조하기 때문에 다른주소를 가질 것으로 생각했기 때문이다.

//세번째 출력값을 true로 예측한 이유는, strArray[0]과 strArray[2]가 상기한 이유로 다른주소를 가진다 한들,
//가지고 있는 메모리(문자열내용)는 Java로 동일하기 때문이다.

