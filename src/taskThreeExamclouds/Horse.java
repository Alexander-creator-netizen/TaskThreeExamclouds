package taskThreeExamclouds;

/**
 * Provides information about objects of the Horse type.
 * Contains a method that calculates the cost of treatment for objects of this class.
 *
 * @author Alex Krentik
 * @data 14.08.2022
 */

public class Horse extends Animal{

    private double rankPureBlood;

    public Horse(String food, String location, String animalBreed, double rankPureBlood) {
        super(food, location, animalBreed);
        this.rankPureBlood = rankPureBlood;
    }

    @Override
    public void medicalExpenses() {
        System.out.println("The cost of treatment: ");
        if (rankPureBlood <= 8.0) {
            System.out.println("1200$.");
        } else {
            System.out.println("3600$.");
        }
    }

    public double getRankPureBlood() {
        return rankPureBlood;
    }
}
