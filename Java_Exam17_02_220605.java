public class Java_Exam17_02_220605 {
    public static void main(String[] args) {
        //5와 6과 7을 더한 합계에 8을 곱한 값은?
        int num1 = (5 + 6 + 7) * 8;
        System.out.println(num1);
        // 7과 8을 더한 값을 5로 나눈 값으로
        // 6에서 4를 뺀 값에 2를 곱한 값을 더한 값은?
        int num2 = ((7+8)/5) + ((6-4)*2);
        System.out.println(num2);

        // 1000을 7로 나눈 나머지는?
        int num3 = 1000 % 7;
        System.out.println(num3);

        // 6을 5로 나눈 값을 2로 나눈 값은?
        double num4 = ((6 / 5.0) / 2.0); // double을 int형으로 나누면
        System.out.println(num4);

        double num6 = (6 / 5);
        System.out.println(num6);
        double num7 = (6 / 5.0);
        System.out.println(num7);

        // 알파벳 대문자 'A' 에 32를 더한 문자는?
        char num5 = (char)('A' + 32);
        System.out.println(num5);
    }
}
