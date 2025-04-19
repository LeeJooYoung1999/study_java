package ch04.exam;
//중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로
//출력하는 코드를 작성하세요. 단, x와 y는 10이하의 자연수 입니다.
public class FindSolution {
    public static void main(String[] args) {
        for(int x=1; x<=10; x++) {     //방정식에 대입할 x값(10이하의 자연수)
            for(int y=1; y<=10; y++) { //방정식에 대입할 y값(10이하의 자연수)
                int answer = 4*x+5*y;  //방정식 좌변 설정
                if (answer==60){       //방정식 우변 설정
                    System.out.println("("+x+","+y+")");
                }
            }
        }
    }
}
