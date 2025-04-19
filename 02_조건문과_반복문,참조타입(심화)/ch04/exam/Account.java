package ch04.exam;

import java.util.Scanner;

//while문과 Scanner의 nextInt() 메서드를 이용해서 다음 실행결과와 같이
//키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성하세요
public class Account {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance =0;  //잔고=balance
        boolean run = true;
        while (run){
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택> ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("예금액>");
                    balance += Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.print("잔고>");
                    System.out.println(balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
