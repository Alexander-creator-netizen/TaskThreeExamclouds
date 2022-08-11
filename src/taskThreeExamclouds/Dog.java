package taskThreeExamclouds;

public class Dog extends Animal{

    private double rankSecurity;

    public Dog(String food, String location, String animalBreed, double rankSecurity) {
        super(food, location, animalBreed);
        this.rankSecurity = rankSecurity;
    }

    @Override
    void medicalExpenses() {
        System.out.println("The cost of treatment: ");
        if (rankSecurity <= 4.0) {
            System.out.println("20$.");
        } else {
            System.out.println("50$.");
        }
    }

    public double getRankSecurity() {
        return rankSecurity;
    }
}
