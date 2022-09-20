package lab_rob1;

public class Seller {
    String name;
    String surName;
    int experience;

    public Seller(String name, String surName, int experience) {
        this.name = name;
        this.surName = surName;
        this.experience = experience;
    }
    String props(){
        return name + " " + surName;
    }
    void experienced() {
        if(experience > 6) {
            System.out.println("Досвідчений продавець");
        } else {
            System.out.println("Не досвідчений");
        }
    }

}
