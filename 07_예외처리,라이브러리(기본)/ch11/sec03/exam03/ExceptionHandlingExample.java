package ch11.sec03.exam03;
//다음 프로그램에 다음 조건에 맞는 다중예외처리코드를 추가하시오
//처리할 예외사항
// - ArrayIndexOutOfBoundsException - 배열의 인덱스가 초과되었을경우 발생하는 예외사항
// - NullPointerException - 객체의 Null값을 참조하려고 해서 발생하는 예외사항.
// - NumberFormatException - 배열의 요소가 숫자타입으로 변환불가능할 경우의 예외사항
// 이때, NullPointerException와 NumberFormatException는 동일한 예외처리 할것.
public class ExceptionHandlingExample{
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};
        for(int i=0; i<=array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i+ "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열인덱스가 초과됨: "+ e.getMessage());
            } catch (NumberFormatException|NullPointerException e) {
                System.out.println("데이터가 문제가 있음: "+e.getMessage());
            }
        }
    }
}

