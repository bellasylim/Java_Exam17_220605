public class Java_Exam17_10_220605 {
    public static void main(String[] args) {

        forHiLevelPractice(5);
//        forHiLevelPractice(10);

    }

    public static void forHiLevelPractice(int level){
        for(int i = 1; i <= level; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(("□ ").repeat(-(i - level)));
                if(i == 1){
                    System.out.print(("■ ").repeat(i));
                }else{
                    System.out.print(("■ ").repeat(i + (i-1)));
                }
                break;
            }
            System.out.println();
        }
    }
}
