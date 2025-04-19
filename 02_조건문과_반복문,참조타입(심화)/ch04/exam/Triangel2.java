package ch04.exam;
//for문을 이용해서 다음과 같은 실행 결과가 나오는 코드를 작성하세요
public class Triangel2 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

//제시된 출력
// *****
// ****
// ***
// **
// *
