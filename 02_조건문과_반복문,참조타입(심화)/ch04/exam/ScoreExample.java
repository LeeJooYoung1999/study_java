package ch04.exam;
// 학생들의 점수를 분석하는 프로그램을 만들려고 한다. 키보드로부터 학생 수와 각 학생들의
// 점수를 입력 받고 while문과 Scanner의 nextInt() 메서드를 이용하여
// 최고 점수와 평균 점수를 출력하는 코드를 작성하시오.

import java.util.Scanner;

public class ScoreExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int population = 0;
        int[] scores =null;

        while (run){
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:  //학생수
                    System.out.print("학생수>");
                    population = Integer.parseInt(sc.nextLine());
                    scores =new int[population];
                    break;
                case 2:  //점수입력
                    for (int i = 0; i < population; i++) {
                        System.out.print("scores["+i+"]>");
                        scores[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 3:  //점수리스트
                    for (int i = 0; i < population; i++) {
                         System.out.println("scores["+i+"]: "+scores[i]);
                    }
                     break;
                case 4:  //분석
                    int sum = 0;
                    double ave = 0;
                    int max = scores[0]; // 초기값을 배열의 첫 번째 요소로 설정
                    for (int i = 0; i < population; i++) {
                        //학생점수총합 연산부
                        sum += scores[i];
                        //학생 최고점수 도출부
                        if (scores[i] > max) {
                            max = scores[i];
                        }
                    }
                    //학생평균점수 연산부
                    ave = (double)sum/population;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + ave);
                    break;
                case 5:
                    run = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
