public class Java_Exam17_01_220605 {
    public static void main(String[] args) {
        //오렌지 가격을 표시하는 int형 변수
        int orprice;

        //오렌지 가격 변수에 1300원 대입
        orprice = 1300;

        //오렌지 개수를 표현하는 int형 변수 선언해서 초기값 6 대입
        int orcount = 6;

        //오렌지 총합계 금액을 표현하는 int형 변수를 선언하고, 초기값 "오렌지 가격 변수 * 오렌지 개수 변수"의 연산 결과 대입
        int orallprice = orprice * orcount;

        //오렌지 가격 변수값 출력
        //오렌지 개수값 출력
        //오렌지 가격 합계 변수 출력
        System.out.println("오렌지의 가격: " + orprice + "원");
        System.out.println("오렌지의 개수: " + orcount + "개");
        System.out.println("오렌지 총액: " + orallprice + "원");
    }
}
