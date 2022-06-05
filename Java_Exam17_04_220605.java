public class Java_Exam17_04_220605 {
    public static void main(String[] args) {
        IfBasicPractice Method1 = new IfBasicPractice();
        Method1.ifBasicPractice(16);
        IfBasicPractice Method2 = new IfBasicPractice();
        Method1.ifBasicPractice(-15);
        IfBasicPractice Method3 = new IfBasicPractice();
        Method1.ifBasicPractice(60);
    }
}

class IfBasicPractice {

    public void ifBasicPractice(int value) {

        System.out.println("value:" + value);

        // if 문 시작
        if (value % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        if(value % 3 == 0) {
            System.out.println("3의 배수입니다.");
        }

        if(value % 4 == 0) {
            System.out.println("4의 배수입니다.");
        }

        if(value % 5 == 0) {
            System.out.println("5의 배수입니다.");
        }

        //괜히 어렵게... 생각해서 중첩 for문을 썼다 ㅎ;
//            if(value % 4 == 0 && value % 5 == 0) {
//                System.out.println("4의 배수입니다.");
//                System.out.println("5의 배수입니다.");
//            }else if(value % 4 == 0){
//                System.out.println("4의 배수입니다.");
//            }else if(value % 5 == 0){
//                System.out.println("5의 배수입니다.");
//            }
//        }else if(value % 4 == 0){
//            System.out.println("4의 배수입니다.");
//
//            if(value % 5 == 0){
//                System.out.println("5의 배수입니다.");
//            }
//        }else if(value % 5 == 0){
//            System.out.println("5의 배수입니다.");
//        }
        System.out.println();
    }
}


