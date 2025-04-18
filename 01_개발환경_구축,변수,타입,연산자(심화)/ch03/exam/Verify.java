package ch03.exam;
//다음은 비교 연산자와 논리 연산자의 복합 연산식이다.
//연산식의 출력 결과를 작성하고, 확인하세요.
public class Verify {
    public static void main(String[] args) {
        int x =10;
        int y = 5;

        System.out.println((x>7)&&(y<=5));  //true
        System.out.println((x%3==2)||(y%2!=1)); //false
    }
}

//결과예측
//1. 논리연산자 &&는 두 값이 모두 true일때 true를 반환하므로, 결과값은 true
//2. 논리연산자 ||는 두 값중 하나만 true여도 true를 반환하나, 이때는 두 값 다 false이므로, 결과값은 false