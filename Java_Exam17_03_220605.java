public class Java_Exam17_03_220605 {
    public static void main(String[] args) {
        // short 형의 변수 s1 을 선언해, 65 를 대입함
        short s1 = 65;
        // s1 값을 출력
        System.out.println(s1);
        // byte 형의 변수 b 를 선언해, 변수 s1 의 값을 대입함
        byte b = (byte)s1;
        // b의 값을 출력
        System.out.println(b);
        // char 형의 변수 c 를 선언해, 변수 b 의 값을 대입함
        char c = (char)b;
        // c 값을 출력
        System.out.println(c);
        // short 형의 변수 s2 를 선언해, 변수 s1 와 b 를 더한 값을 대입함
        short s2 = (short)(s1 + b);
        // s2 값을 출력함
        System.out.println(s2);
    }
}
