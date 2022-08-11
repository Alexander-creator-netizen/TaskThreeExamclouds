package taskThreeExamclouds;

public class Cat extends Animal{

    private double rankPopularity;

    public Cat(String food, String location, String animalBreed, double rankPopularity) {
        super(food, location,animalBreed);
        this.rankPopularity = rankPopularity;
    }

    @Override
    void medicalExpenses() {
        System.out.println("The cost of treatment: ");
        if (rankPopularity <= 6.0) {
            System.out.println("100$.");
        } else {
            System.out.println("600$.");
        }
    }

    public double getRankPopularity() {
        return rankPopularity;
    }
}
