package taskThreeExamclouds;

/**
 * Creating an abstract Animal class.
 * Describes the general state and behavior that the heirs of this class will have.
 *
 * @author Alex Krentik
 * @data 14.08.2022
 */

public abstract class Animal {

    private String food;
    private String location;
    private String animalBreed;

    public Animal(String food, String location, String animalBreed) {
        this.food = food;
        this.location = location;
        this.animalBreed = animalBreed;
    }

    public abstract void medicalExpenses();

    public String toString() {
        return "Now at the reception: " + animalBreed + ", "
                + "Food ration: " + food + ", "
                + "Dwelling place: " + location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }
}
