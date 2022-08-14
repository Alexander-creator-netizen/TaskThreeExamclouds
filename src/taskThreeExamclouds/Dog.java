package taskThreeExamclouds;

/**
 * Provides information about objects of the Dog type.
 * Contains a method that calculates the cost of treatment for objects of this class.
 *
 * @author Alex Krentik
 * @data 14.08.2022
 */

public class Dog extends Animal{

    private double rankSecurity;

    public Dog(String food, String location, String animalBreed, double rankSecurity) {
        super(food, location, animalBreed);
        this.rankSecurity = rankSecurity;
    }

    @Override
    public void medicalExpenses() {
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
