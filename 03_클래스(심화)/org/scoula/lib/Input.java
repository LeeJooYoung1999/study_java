package org.scoula.lib;
import java.util.*;
//멤버변수로 Scanner 객체에 대한 정적 참조 변수를 가지며, 바로 초기화 하는
//Input 클래스를 정의하세요.
public class Input {
    public static Scanner sc = new Scanner (System.in);
    private Input() {};
    //Input 클래스에 다음과 같은 정적메서드를 추가하세요.
    //문자열 입력: String read(String title): 매개변수 title을 출력,(줄바꿈X) 사용자가 입력한 문자열을 리턴.
    //           String read(String title, String defaultValue): 매개변수 title(default Value)을 출력, 사용자가 입력한 문자열을 리턴, 그냥 엔터 클릭시 defaultValue를 출력.
    public static String read(String title) {
        System.out.print(title);
        return sc.nextLine();
    }
    public static String read(String title, String defaultValue) {
        System.out.print(title+"("+defaultValue+")");
        String input = sc.nextLine();
        return input.isEmpty()?defaultValue:input;
    }
    //정수 입력: int readint(String title): 매개변수 title을 출력,(줄바꿈X) 사용자가 입력한 문자열을 정수변환하여 리턴.
    public static int readInt(String title){
        System.out.print(title);
        while (true){
            String input = sc.nextLine();
            try{
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("숫자를 입력해주세요: "); //오류발생시 다시입력 요청(예외처리)
            }
        }
    }
    //가/부 확인: boolean confirm(String title, boolean defaultValue): 매개변수title(Y/n)을 출력,(줄바꿈X) defaultValue가 true이면 (Y/n), false이면 (y/N)을 출력. 그냥 엔터시에는 기본값 리턴.
    //           boolean confirm(String title): 앞에서 정의한 confirm을 호출하여 결과를 리턴.
    public static boolean confirm(String title, boolean defaultValue) {
        System.out.print(title+(defaultValue?"(Y/n): ":"(y/N): "));
        String input = sc.nextLine().trim().toLowerCase();
        if(input.isEmpty()) {return defaultValue;}
        return input.equals("y"); //y입력시 true, 아니면 false
    }
    public static boolean confirm(String title) {
        return confirm(title, true); //기본값 true로 설정하여 호출
    }
}
