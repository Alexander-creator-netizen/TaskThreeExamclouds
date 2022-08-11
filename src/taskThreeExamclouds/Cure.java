package taskThreeExamclouds;

public class Cure {

    public static Animal[] animals;

    public static void main(String[] args) {
        Dog husky = new Dog("fish", "Siberia", "husky",4.9);
        Dog spitz = new Dog("cucumber", "Poland", "spitz",2.0);
        Cat sphinx = new Cat("chiken", "Canada", "sphinx",5.5);
        Cat exoticСat = new Cat("turkey", "USA", "exoticСat",10.0);
        Horse mustang = new Horse("root vegetables", "mustang","North America", 8.5);
        Horse trotter = new Horse("oats", "Russia", "trotter",7.6);
        VetClinic doctor = new VetClinic();

        animals = new Animal[]{husky, spitz, sphinx, exoticСat, mustang, trotter};

        doctor.medicalReception();
    }
}
