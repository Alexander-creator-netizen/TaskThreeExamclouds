package taskThreeExamclouds;

/**
 * The program is executing.
 * Creating objects, an array of these objects, a method that gives information about these objects.
 *
 * @author Alex Krentik
 * @data 14.08.2022
 */

public class Cure {

    public static Animal[] animals;

    public static void main(String[] args) {
        Dog husky = new Dog("fish", "Siberia", "husky",4.9);
        Dog spitz = new Dog("cucumber", "Poland", "spitz",2.0);
        Cat sphinx = new Cat("chiken", "Canada", "sphinx",3.0);
        Cat exoticСat = new Cat("turkey", "USA", "exoticСat",7.0);
        Horse mustang = new Horse("root vegetables", "mustang","North America", 8.5);
        Horse trotter = new Horse("oats", "Russia", "trotter",7.6);
        VetClinic doctor = new VetClinic();

        animals = new Animal[]{husky, spitz, sphinx, exoticСat, mustang, trotter};

        doctor.medicalReception(animals);
    }
}
