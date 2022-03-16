public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 90.5;
        int height = 165;
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
