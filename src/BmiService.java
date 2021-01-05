public class BmiService {
    public float calculate(int mass, float height) {

        float bmi = mass / ((height / 100) * (height / 100));
        return bmi;
    }
}
