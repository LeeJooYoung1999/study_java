package ch11.sec05;
//다음 코드가 예외처리가 되도록 코드를 완성하세요.
public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e){
            System.out.println("예외 처리: "+ e.toString());
        }
    }
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}

//해당 코드의 예외발생가능성 파악하기
//주어진 코드를 작성해보면, 콘솔에 "처리되지 않은 예외: java.lang.ClassNotFoundException"라는
//문구가 뜬다. 이는 자바에서 클래스를 찾을 수 없을 때 발생하는 예외로,
// 클래스를 로드할 때 클래스 경로에 해당 클래스가 없거나 클래스 이름이 잘못된 경우 발생한다.
//따라서, 위 코드에서 발생할 수있는 예외사항은 ClassNotFoundException이다.