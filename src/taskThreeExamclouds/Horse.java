package taskThreeExamclouds;

public class Horse extends Animal{

    private double rankPureBlood;

    public Horse(String food, String location, String animalBreed, double rankPureBlood) {
        super(food, location, animalBreed);
        this.rankPureBlood = rankPureBlood;
    }

    @Override
    void medicalExpenses() {
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
