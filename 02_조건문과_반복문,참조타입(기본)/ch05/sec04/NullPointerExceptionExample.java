package ch05.sec04;
//다음 코드대로 작성하고 잘못된 부분을 찾아 그 이유를 설명하세요
public class NullPointerExceptionExample {
    public static void main(String[] args) {
            int[] intArray = null;
            intArray[0] = 10;

            String str =null;  //str변수에 null을 대입한 상태에서, 문자열 길이를 얻기 위해,
                                // length()메소드 호출했기 때문에 NullPointerException 발생한다.
            System.out.println("총 문자 수: " + str.length() );
        }
}
