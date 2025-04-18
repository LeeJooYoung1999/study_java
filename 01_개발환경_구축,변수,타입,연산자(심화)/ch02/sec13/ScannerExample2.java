package ch02.sec13;
//ch02.sec13.ScannerExample.java 클래스에 무한 루프를 돌면서 아래와 같이 입력과 출력을 처리
//하는 코드를 작성하세요.
//이름이 똑같은 문제가 존재하여, 임의로 ScannerExample2로 명명함

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("입력 문자열: ");
            String data = sc.nextLine();
            if(data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}

//제시된 출력
//입력 문자열: Hello
//출력 문자열: Hello
//입력 문자열: 안녕하세요
//출력 문자열: 안녕하세요
//입력 문자열: q
//종료