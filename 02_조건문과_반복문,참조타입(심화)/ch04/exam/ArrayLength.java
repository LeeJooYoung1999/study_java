package ch04.exam;
//다음은 배열길이를출력하는코드이다. 실행결과를작성하세요
public class ArrayLength {
    public static void main(String[] args) {
        int[][]array = {
                {95, 86},
                {93, 92, 96},
                {78, 83, 93, 87, 88}
        };
        System.out.println(array.length);  //3
        System.out.println(array[2].length); //5
    }
}

//결과예측
//첫번째는 이차원 배열중 첫번째 차원의 길이를 의미하므로, 행의길이(포함한 배열의 개수)인 3을 출력할 것으로 예상된다.
//두번째는 포함된 배열중 3번째 배열의 길이를 의미하므로, 3번째 행의 열의 개수(요소의개수)인 5를 출력할 것으로 예상된다.