package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int m=2;m<=9;m++){  //~단 지정
            System.out.println("*** " + m + "단 ***");
            for (int n=1;n<=9;n++){  //~단의 내용물
                System.out.println(m+" X "+n+" = "+(m*n));
            }
        }
    }
}
