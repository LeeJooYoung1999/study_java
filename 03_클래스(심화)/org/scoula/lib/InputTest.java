package org.scoula.lib;
//InputTest 클래스를 만들어 앞에서 만든 Input의 동작을 확인하는 코드를 작성하세요.
public class InputTest {
    public static void main(String[] args) {
        // 1. 문자열 입력 확인
        String name = Input.read("이름: ");
        System.out.println("입력값: " + name);
        // 2. 기본값이 있는 문자열 입력 확인
        String defaultName = Input.read("이름(홍길동): ", "홍길동");
        System.out.println("입력값: " + defaultName);

        // 3. 정수 입력 확인
        int age = Input.readInt("나이: ");
        System.out.println("입력값: " + age);

        // 4. 가/부 확인 - 사용자 입력 있음
        boolean confirmExit = Input.confirm("종료할까요? (Y/n): ", false);
        System.out.println("입력값: " + confirmExit);
        // 5. 가/부 확인 - 기본값 사용
        boolean confirmExitDefault = Input.confirm("종료할까요? (Y/n): ");
        System.out.println("입력값: " + confirmExitDefault);

    }
}

//제시된 출력
//이름: 이세돌
//입력값: 이세돌
//이름(홍길동):
//입력값: 홍길동
//나이: 10
//입력값: 10
//종료할까요? (Y/n): n
//입력값: false
//종료할까요? (Y/n):
//입력값: true