package ch07.exam;
//다음 클래스를 실행하면 "로그인 합니다", "파일 다운로드 합니다."가 차례대로 출력되도록
// LoginServlet과 FileDownloadServlet 클래스를 정의하고,
// method 메서드를 완성하세요.
public class FileDownloadServlet extends HttpServlet {
    @Override
    public void service() {
        System.out.println("파일 다운로드합니다.");
    }
}
