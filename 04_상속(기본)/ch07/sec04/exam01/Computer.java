package ch07.sec04.exam01;
// Calculator를 상속한 Computer 클래스를 정의하고, areaCircle() 메서드를 재정의하세요.
// Computer 클래스의 areaCircle()은 Math.PI상수를 이용해 계산함
import java.util.*;
public class Computer extends Calculator {
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer객체의 areaCircle()실행");
        return Math.PI*r*r;  //원의 면적을 Math.PI상수를 이용해 계산
    }
}
