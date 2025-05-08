package ch17.sec10;
//다음과 같이 출력되도록 코드를 작성하세요.
import java.util.Arrays;
public class AggregateExample {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};  //정수배열 생성

        //2의배수 카운팅
        long count = Arrays.stream(arr)
                .filter(n->n%2==0) //2의배수는, 2로나누어떨어지는 수
                .count();
        System.out.println("2의 배수 개수: "+count);

        //2의배수 총합
        long sum = Arrays.stream(arr)
                .filter(n->n%2==0)
                .sum();
        System.out.println("2의 배수의 합: "+sum);

        //2의배수 평균
        double avg = Arrays.stream(arr)
                .filter(n->n%2==0)
                .average()
                .getAsDouble(); //위에서 연산한것은 OptionalDouble타입이므로, 형변환해준다.
        System.out.println("2의 배수의 평균: "+avg);

        //2의배수 중 최대값
        int max = Arrays.stream(arr)
                .filter(n->n%2==0)
                .max()
                .getAsInt();
        System.out.println("최대값: "+max);

        //2의배수 중 최소값
        int min = Arrays.stream(arr)
                .filter(n->n%2==0)
                .min()
                .getAsInt();
        System.out.println("최소값: "+min);

        //첫번째 3의배수
        int first = Arrays.stream(arr)
                .filter(n->n%3==0)
                .findFirst()
                .getAsInt();
        System.out.println("첫 번째 3의 배수: "+first);

    }//psvm
}//class


//제시된 출력
//2의 배수 개수: 2
//2의 배수의 합: 6
//2의 배수의 평균: 3.0
//최대값: 4
//최소값: 2
//첫번째 3의 배수: 3