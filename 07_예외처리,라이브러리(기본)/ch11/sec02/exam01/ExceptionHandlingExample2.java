package ch11.sec02.exam01;
//앞선 ExceptionHandlingExample1예제에 다음과 같은 예외처리코드를 추가하세요.
//예외처리시 출력할 메시지
// - 예외 객체의 메시지로 출력.
// - 스택추적 내용을 모두 출력.
public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            //System.out.println(e.getMessage()); //예외객체의 메시지로 출력
            e.printStackTrace();// e.printStackTrace()의 경우, 스택추적내용을 전부 출력해준다.
        } finally {
            System.out.println("[마무리 실행]\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
