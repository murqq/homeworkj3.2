public class BmiService {
    public int calculate(int weight, double height) {
        double bmiIndex = weight / (height * height);
        return (int) bmiIndex;
    }
}


