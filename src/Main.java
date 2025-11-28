public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Git Practice!");
        System.out.println("Github 연동 성공! 기능 추가 중...");

        studentList(); // 새로 추가한 기능 호출
    }

    // 새로 만든 기능
    public static void studentList() {
        System.out.println("=== 학생 목록 ===");
        System.out.println("1. 철수");
        System.out.println("2. 영희");
    }
}