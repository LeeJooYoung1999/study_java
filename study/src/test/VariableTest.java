package test; //세미콜론 ; 생략 불가능

//int x = 100; //모든변수는 class 안으로 들어가야만 함. 전역변수 없음.
public class VariableTest {

    public static void main(String[] args) {
        //이 부품은 독립적으로 실행할 수 있는 부품이 된다.
        // 함수인데, 만약에 함수가 여러개인 경우, 무조건 main()을 호출!
        //타입 변수명; 꼴이면 --> 변수가 생성됨. 선언!
        //자바는 변수에 들어갈 타입이 선언될때 결정됨 (정적 타입핑)

        //기본형 4가지 : 정수, 실수, 문자1, 논리형 테스트해보자!
        //정수 : byte(1), short(2), int(4), long(8) 각각 괄호안의 수만큼 방 가짐.
        byte age = 27;  //변수는 소문자로 시작해 주세요...!  //+실무) 쓰레기값이 들어갈 수 있기 때문에, 자바는 반드시 변수만들때 초기값을 넣어주는 습관을 가져라!
        short year = 2025;
        int hit = 210000000;
        long money = 2200000000000L;  //"사용자가 int를 쓰려고 하는데 실수했구나"라고 생각할 번역기를 위해,
                                      // 끝에 L 붙여 Long쓰려는 의도를 전달함.

        //실수 : float(소수점 7, 4바이트), double(15, 8바이트)
        float w = 81.9F;  //f
        double h = 173.00000000555;

        //문자1 : char
        char gender = '남'; //홑따옴표 필수!

        //논리형 : boolean
        boolean food = true; // or false

        System.out.println("내 나이는 "+ age +"세야.");
        //+연산자가 하나라도 문자열이면 결과는 String(결합연산자)임을 이해할것.
        System.out.println("내 몸무게 " + w + "kg이야.");
        System.out.println("내 성별은 " + gender + "자야.");
        System.out.println("나는 오늘 아침을 먹었을까? " + food);

        String name = "이주영"; //문자 는 홑따옴표지만, 문자열 은 겹따옴표임 절대주의!!
        String plan = """
                나는
                훌륭한
                자바 개발자가 되리라!!
                Vue OUT!!!
                """;
        System.out.print("출력하고 엔터치지마!!");
        System.out.println("내 이름은 "+ name);
        System.out.println("내 계획은 "+plan);  //한줄복사 (ctrl + d)
        System.out.printf("내 이름은 %s이야!", name);
        System.out.printf("내 몸무게는 %2f, 내 키는 %10.3f", w,h);
    }
}
