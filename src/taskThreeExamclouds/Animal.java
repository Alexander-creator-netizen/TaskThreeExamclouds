package taskThreeExamclouds;

public class Animal {

    String food;
    String location;
    String animalBreed;

    public Animal(String food, String location, String animalBreed) {
        this.food = food;
        this.location = location;
        this.animalBreed = animalBreed;
    }

    void medicalExpenses() {
    }

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
