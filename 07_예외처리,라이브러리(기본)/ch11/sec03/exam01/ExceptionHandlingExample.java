package ch11.sec03.exam01;
//다음 프로그램에 다중예외처리코드를 추가하세요.
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100","1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] = " + value);
            } catch (ArrayIndexOutOfBoundsException e) { //예외처리1: 배열의 인덱스가 초과되었을 경우의 예외처리
                System.out.println("배열인덱스가 초과됨"+ e.getMessage());
            } catch (NumberFormatException e) {     //예외처리2: 배열의 요소가 숫자타입으로 변환불가능할 경우의 예외처리
                System.out.println("숫자로 변환 불가능함."+e.getMessage());
            }
        }
    }
}
