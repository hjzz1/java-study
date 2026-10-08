public class Lesson2 {
  public static void main(String[] args) {

    /*int x; // x라는 변수를 생성
    x = 10; // 할당 : x라는 상자에 10이라는 값을 넣음
    */
    // = : 대입연산자

    int x = 10; // 변수 초기화
    System.out.println("x: " + x);

    x = 20; // 변수 재활용
    System.out.println("x: " + x);

    x = x + 30;
    System.out.println("x: " + x);

    int y = 50;
    System.out.println("y: " + y);

    // 변수의 명명 규칙
    // 카멜케이스(camelCase) : 첫글자는 소문자로 시작하고, 뒤에오는 단어 첫 글자는 대문자로
    // userName, sudentScore

    String name = "김덕배";
    System.out.println("내 이름은 " + name);



  }
}
