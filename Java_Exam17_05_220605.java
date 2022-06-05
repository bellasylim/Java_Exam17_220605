public class Java_Exam17_05_220605 {
    public static void main(String[] args) {
        ifNormalPractice(25);
        ifNormalPractice(18);
        ifNormalPractice(12);
        ifNormalPractice(-2);
    }

    public static void ifNormalPractice(int age){

        System.out.println("연령: " + age);

        if(age >= 20){
            System.out.println("성인입니다.");
        }else if(age < 20 && age >= 0){
            System.out.println("미성년자입니다.");

            if(age > 6 && age < 14){
                System.out.println("지금은 의무 교육을 받고 있습니다.");
            }else{
                System.out.println("지금은 의무 교육을 받지 않습니다.");
            }

        }else{
            System.out.println("오류입니다.");
        }

        System.out.println();
    }
}