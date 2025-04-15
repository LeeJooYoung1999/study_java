package ch04.sec05;  //교안에는 sec04로 표시되긴 했으나,
                    // sec04에서 이미 풀었던 for문의 while문화 라고 생각해서 sec05에 작성했습니다.

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1~"+(i-1)+"합: "+sum);
    }
}
