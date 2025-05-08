package ch09.sec02.exam02;
//다음 클래스를 실행했을 때 결과가 어떻게 나올지 적어보고, 실제 확인하세요.
public class AExample {
    public static void main(String[] args) {
        //A 객체 생성
        A a = new A();

        //A 인스턴스 메소드 호출
        a.useB();
    }
}

//실제출력
//C:\jdk-17\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\lib\idea_rt.jar=62090:C:\Program Files\JetBrains\IntelliJ IDEA 2024.3.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\student\Documents\study_java\06_중첩객체(기본)\out\production\06_중첩객체(기본)" ch09.sec02.exam02.AExample
//B-생성자 실행
//1
//B-method1 실행
//2
//B-method2 실행
//
//종료 코드 0(으)로 완료된 프로세스