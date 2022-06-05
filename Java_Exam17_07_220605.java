public class Java_Exam17_07_220605 {
    public static void main(String[] args) {

        switchBasicPractice(1);
        switchBasicPractice(2);
        switchBasicPractice(4);
        switchBasicPractice(13);

        //모든 월 확인
//        for(int i = 1; i <= 12; i++){
//            switchBasicPractice(i);
//        }

    }

    public static void switchBasicPractice(int month){
        System.out.println(month + "월");

        switch(month){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(month + "월은 31일까지 있습니다.");
                break;

            case 4, 6, 9, 11:
                System.out.println(month + "월은 30일까지 있습니다.");
                break;

            case 2:
                System.out.println(month + "월은 28 또는 29일까지 있습니다.");
                break;

            default:
                System.out.println("에러");
        }
        System.out.println();
    }
}
