package lab_rob1;

public class Client {
    String brand;
    String model;
    int budget;

    public Client(String brand, String model, int budget) {
        this.brand = brand;
        this.model = model;
        this.budget = budget;
    }
    int money(){
        return budget;
    }
    void favoriteCar(){
        System.out.println(brand + " " + model);
    }





}
