package lab_rob1;

public class Main {
    public static void main(String[] args) {
        AutoSalon autoSalon = new AutoSalon(25.0,20.5, 17);//Створив обєкт класу і ініціалізував через конструктор
        autoSalon.cars();
        System.out.println("Площа автосалону: " + autoSalon.square());//Викликав методи

        System.out.println();

        Client c = new Client("Volkswagen", "Golf7",25000);
        System.out.println("Бюджет клієнта: " + c.money());
        c.favoriteCar();

        System.out.println();

        Seller s = new Seller("Іван","Cупик",10);
        s.experienced();
        System.out.println("Імя та Прізвище продавця: " + s.props());


    }

}
