public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80.00;
        double height = 172.00;
        double bmi = service.calculate(height, weight);
        System.out.println("Ваш индекс массы тела:" + " " + bmi + " " + "кг/м2");
    }

}
