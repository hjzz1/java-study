public class Lesson1 {
  public static void main(String[] args) {
    // 데이터 타입
    // 문장형(문자열), 숫자형(정수, 실수)
    // 컴퓨터는 문장과 숫자를 처리하는 방식이 다르다.

    // 컴퓨터는 문장과 문자를 처리하는 방식이 다르다.
    //"" : 큰따옴표로 감싼 내용은 문장으로 처리
    //'' : 작은따옴표는 감싼 내용은 문자로 처리
    System.out.println("안녕");
    System.out.println('안');

    System.out.println("123"); // 문장 123
    System.out.println(123); // 숫자 123

    System.out.println("안" + "녕"); // 안녕
    System.out.println("10" + "20"); // 1020

    System.out.println("== 문장 더하기 숫자 ==");
    // 형변환(casting) : 기존에 가지고 있던 데이터 타입에서 다른 데이터 타입으로 형이 변환됨
    System.out.println("안" + 10);

    System.out.println("== 문장 더하기 숫자 더하기 숫자 ==");
    System.out.println("안" + 10 + 20); // 안1020
    System.out.println("안" + (10 + 20)); // 안30

    System.out.println("==문장 더하기 숫자 곱하기 숫자==");
    System.out.println("안" + 10 * 20);


  }
}
