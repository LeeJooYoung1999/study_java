package ch05;
//향상된 for문을 이용하여 scores 배열의 점수 총합과 평균 점수를 출력하세요.
public class AdvancedForExample {
    public static void main(String[] args) {

        int[] scores={95, 71, 84, 93, 87};
        int sum = 0;
        //향상된 for문 구조: for (타입 : 배열){실행문} : 배열의 항목개수만큼 반복하는 for문
        for (int score : scores) {
            sum +=score;
        }
        System.out.println("점수 총합 = "+sum);
        double ave = (double)sum / (double)scores.length;
        System.out.println("점수 평균 = "+ave);
    }
}
