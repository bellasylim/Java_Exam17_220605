public class Java_Exam17_09_220605 {
    public static void main(String[] args) {

        for(int i = 10; i <= 100; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    break;
                }else{
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
