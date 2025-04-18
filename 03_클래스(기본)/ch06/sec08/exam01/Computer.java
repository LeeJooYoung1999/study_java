package ch06.sec08.exam01;

public class Computer {
    // ComputerExample에서 메소드sum에 사용되는 매개변수의 개수를
    // 지정해 주지 않았으므로, 가변길이 매개변수를 제공한다.
    int sum (int ... values){
        int sum = 0;    //우선 연산하기 전에 초기값 설정.
        for (int i =0; i<values.length; i++){  //for문을 이용해, 미지수의 매개변수를 합산한다.
            sum += values[i];
        }
        return sum; //리턴값
    }
}
