package ch02.sec13;

import java.util.Scanner;
//Scanner 객체를 이용하여 아래 그림과 같이 x, y에 입력받고, 그 합을 출력하는 ch02.sec13.Scann
// erExample.java 클래스를 작성하세요.
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x값 입력:");
        int x = sc.nextInt();
        System.out.print("y값 입력:");
        int y = sc.nextInt();
        int result = x+y;
        System.out.print("x+y:"+result);
    }
}

//제시된 출력
// x 값 입력: 3
// y 값 입력: 5
// x + y: 8