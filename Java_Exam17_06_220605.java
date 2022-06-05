public class Java_Exam17_06_220605 {
    public static void main(String[] args) {
        ifCalculatePractice(170.0, 88.0);
        ifCalculatePractice(170.0, 55.0);
        ifCalculatePractice(159.0, 52.0);
    }

    public static void ifCalculatePractice(double height, double weight){

        System.out.println("신장: " + height + " (cm)");
        System.out.println("체중: " + weight + " (kg)");

        //BMI 값 계산 및 표시
        double bmi = weight / ((height * height)/10000);

        System.out.println("당신의 bmi값은 " + bmi + "입니다.");

        if(bmi >= 26.5){
            System.out.println("비만입니다.");
        }else if(bmi >= 24 && bmi < 25.5){
            System.out.println("과체중입니다.");
        }else if(bmi >= 20 && bmi < 24){
            System.out.println("정상입니다.");
        }else{
            System.out.println("저체중입니다.");
        }
        System.out.println();
    }
}
