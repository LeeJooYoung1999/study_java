package ch16.sec03;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //매개변수가 두개일 경우
        person.action1((name, job)->{
            System.out.print(name + "이 ");
            System.out.println(job + "을 합니다.");
        });

        person.action1((name, job)->{
            System.out.print(name + "이 ");
            System.out.println(job+"을 하지 않습니다.");
        });
        //매개변수가 한개일 경우
        person.action2((content)->{
            System.out.println("\""+content+"\""+"라고 말합니다.");
        });
        person.action2((content)->{
            System.out.println("\""+content+"\""+"라고 외칩니다.");
        });
    }
}

//제시된 출력
//홍길동이 프로그래밍을 합니다.
//홍길동이 프로그래밍을 하지않습니다.
//"안녕하세요"라고 말합니다.
//"안녕하세요"라고 외칩니다.