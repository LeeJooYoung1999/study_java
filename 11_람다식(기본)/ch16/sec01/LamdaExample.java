package ch16.sec01;

public class LamdaExample {
    public static void main(String[] args) {
        //x + y 계산
        action((x,y) -> {
            int result = x + y;
            System.out.println("result: "+result);
        }); //람다식을 사용하여 간결하게 표현

        //x - y 계산
        action((x,y) -> {
            int result = x - y;
            System.out.println("result: "+result);
        });

    }//psvm
    public static void action (Calculable calculable) {
        //데이터
        int x = 10;
        int y = 4;
        //데이터 처리
        calculable.calculate(x, y);
    }//action => 데이터 처리부
}//class

// 제시된 출력
// result: 14
// result: 6