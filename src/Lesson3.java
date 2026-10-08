// 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.
// 조건 : 수정 가능 지역에서 숫자와 사칙연상르 사용할 수 없습니다.
public class Lesson3 {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;

    // 수정 가능 시작
    int c = a;
    a = b;
    b = c;
    // 수정 가능 끝

    System.out.println("a : " + a);
    System.out.println("b : " + b);
  }
}
