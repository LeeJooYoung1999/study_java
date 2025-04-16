package ch04.sec05;

import java.util.Scanner;

//다음을 처리하는 코드를 완성하세요.
//----------------------------
//1. 증속 | 2. 감속 | 3. 중지         를 조절하는 메뉴를 출력.
// ----------------------------
//Scanner 객체로 메뉴 번호를 입력
//속도의 값을 조정하여 출력
//3을 입력하면 프로그램은 종료.
public class KeyControlExample {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //Scanner 객체는 java의 패키지에서 제공하는 도구로, 입력을 읽기 위해 사용된다.
                                                    //키보드, 파일, 또는 다른 입력소스에서 데이터를 가져올수 있다.
        boolean run = true; //while문의 조건식을 위한 변수선언
        int speed = 0; //속도의 초기값 설정
        while(run) {
            System.out.println("----------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("----------------------------");
            System.out.print("선택: ");

            String input = scanner.nextLine(); //키보드에서 입력한 내용을 input이라는 변수에 문자열로 받는 구문.

            if (input.equals("1")) {
                speed++;
                System.out.println("현재속도 = " + speed);
            } else if (input.equals("2")) {
                speed--;
                System.out.println("현재속도 = " + speed);
            } else if (input.equals("3")) {
                System.out.println("프로그램 종료1");
                run = false;
            }
        }
    }
}

//제시된 출력
//----------------------------
//1. 증속 | 2. 감속 | 3. 중지
// ----------------------------
//선택: 1
//현재 속도 = 1
// ----------------------------
//1. 증속 | 2. 감속 | 3. 중지
// ----------------------------
//선택: 2
//현재 속도 = 0
// ----------------------------
//1. 증속 | 2. 감속 | 3. 중지
// ----------------------------
//선택: 3
//프로그램 종료1
