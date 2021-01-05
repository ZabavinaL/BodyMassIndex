public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float bmi = service.calculate(64, 162);
        System.out.println("IMT_1 = " + bmi);

        float bmi_2 = service.calculate(84, 170);
        System.out.println("IMT_2 = " + bmi_2);
    }
}