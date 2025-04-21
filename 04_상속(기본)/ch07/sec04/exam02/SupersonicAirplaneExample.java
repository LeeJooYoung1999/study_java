package ch07.sec04.exam02;
//SupersonicAirplaneExample클래스의 실행결과를 적어보고, 실제결과와 비교해보세요.
public class SupersonicAirplaneExample {
    public static void main (String[] args){
        SupersonicAirplane ssA = new SupersonicAirplane();
        ssA.takeOff(); //SupersonicAirplane의 부모인 Aiplane에서 따옴.
        ssA.fly();
        ssA.flyMode = SupersonicAirplane.SUPERSONIC;
        ssA.fly();
        ssA.flyMode = SupersonicAirplane.NORMAL;
        ssA.fly();
        ssA.land();
    }
}

//실행결과
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\lib\idea_rt.jar=54243:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\student\Documents\study_java\04_상속(기본)\out\production\04_상속(기본)" ch07.sec04.exam02.SupersonicAirplaneExample
//이륙합니다.  -  takeOff 결과
//일반비행합니다.  -  fly()의 기본값 도출
//초음속 비행합니다.  -  flyMode = SupersonicAirplane.SUPERSONIC 이후 fly()의 결과
//일반비행합니다.  -  flyMode = SupersonicAirplane.NORMAL 이후 fly()의 결과
//착륙합니다.  -  land()의 결과.
//
//종료 코드 0(으)로 완료된 프로세스