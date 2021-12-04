public class BmiService {

    public double calculate (double weight, double height) {
        double bmi = (weight*1000) / (height * height); //домножаем на 1000 для традиционного отображения индекса
        return bmi;
    }
}
