package lab_rob1;

public class AutoSalon {
    double length;
    double width;
    int numberOfCars;

    public AutoSalon(double length, double width, int numberOfCars) {
        this.length = length;
        this.width = width;
        this.numberOfCars = numberOfCars;
    }
    void cars(){
        System.out.println("Кількість автомобілів у салоні: " + numberOfCars);
    }
    double square(){
        double s = length*width;
        return s;
    }
}
