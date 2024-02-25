public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        int weightKilo = 98;
        int heightСentimeters = 187;
        int bmiIndex = service.calculate(weightKilo, heightСentimeters);
        System.out.println("Индекс BMI - " + bmiIndex);
    }
}