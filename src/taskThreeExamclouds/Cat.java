package taskThreeExamclouds;

/**
 * Provides information about objects of the Cat type.
 * Contains a method that calculates the cost of treatment for objects of this class.
 *
 * @author Alex Krentik
 * @data 14.08.2022
 */

public class Cat extends Animal {

    private double rankPopularity;

    public Cat(String food, String location, String animalBreed, double rankPopularity) {
        super(food, location,animalBreed);
        this.rankPopularity = rankPopularity;
    }

    @Override
    public void medicalExpenses() {
        System.out.println("The cost of treatment: ");
        if (rankPopularity <= 4.0) {
            System.out.println("100$.");
        } else {
            System.out.println("600$.");
        }
    }



    public double getRankPopularity() {
        return rankPopularity;
    }
}
