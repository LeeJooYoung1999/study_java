package ch05.sec06;
//다음 배열들을 이용해 다음과 같이 출력하도록 코드를 완성하세요.
public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter" };
        //우선 제시된 출력사항중 초반4줄이 사전정의된 배열season의 항목값들이 출력된듯 하므로,
        //for문을 이용해 출력해준다.
        for (int i = 0; i < season.length; i++) {
            System.out.println("season["+i+"] : "+ season[i]);
        }
        System.out.println(); //줄내림
        int[] scores = { 83, 90, 87 };
        //제시된 출력사항중 후반 2줄이 배열scores의 총합,평균을 출력한것으로 보이므로,
        //배열의 각 항목값을 합산한 값을 갖는 변수 sum과, sum을 배열의 길이로 나눈값인 변수 ave를 정의하여
        //출력한다.
        int sum = 0;
        double ave = 0;  //제시된 출력상, 평균값이 실수로 제시되어있으므로, double을 이용해 정의
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        ave = (double)sum / scores.length;  //실수타입 변수인 ave의 연산을 위해, 정수타입인 sum에 자동형변환을 취해준다.
        System.out.println("총합 : "+sum);
        System.out.println("평균 : "+ave);
    }
}
//제시된 출력
// season[0] : Spring
// season[1] : Summer
// season[2] : Fall
// season[3] : Winter
//
//총합 : 260
//평균 : 86.66666666666667