package ch05.sec06;
//다음과 같이 출력되도록 printItem()메소드를 추가하세요.
public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        int[] scores = new int[]{83, 90, 87};
        printItem(scores);
    }
        //printItem()의 메소드 선언하기
        public static void printItem(int[] scores){
            for (int i = 0; i < scores.length; i++) {
                System.out.println("score["+i+"]: "+scores[i]);
            }
    }
}


// 제시된 출력
// score[0]: 83
// score[1]: 90
// score[2]: 87
