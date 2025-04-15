package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;
        x++;
        ++x;
        System.out.println("x=" + x);
        System.out.println("-----------------------");

        y--;--y;
        System.out.println("y=" + y);
        System.out.println("-----------------------");

        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("-----------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("-----------------------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}

//실행결과
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.5\lib\idea_rt.jar=50642" -Dfile.encoding=UTF-8 -classpath C:\Users\ptljo\OneDrive\문서\study_java\out\production\study_java ch03.sec01.IncreaseDecreaseOperatorExample
//x=12
//-----------------------
//y=8
//-----------------------
//z=12
//x=13
//-----------------------
//z=14
//x=14
//-----------------------
//z=23
//x=15
//y=9
//
//종료 코드 0(으)로 완료된 프로세스