package ch03.exam;
// 다음 그림에 있는 사다리꼴의 넓이를 구하세요.
//단, 넓이는 실수로 출력할것.
//윗변의 넓이 = 5 / 아랫변의 넓이 = 10 / 높이 = 7 인 사다리꼴 제시됨.

public class Trapezoid {
    public static void main(String[] args) {
        //사다리꼴의 스펙 선언
        int height = 7;
        int upperWidth = 5;
        int lesserWidth = 10;
        //사다리꼴의 넓이 선언 및 연산
        double dimension = (double)height*((double)upperWidth+(double)lesserWidth)/2;
        //사다리꼴의 넓이 출력
        System.out.println("사다리꼴의 넓이 : " + dimension);
    }
}
