public class BmiService {
    public double calculate(double weight, int height) {
        double heightMeters = height / (double) 100;

        return (weight / (heightMeters * heightMeters));
    }
}
