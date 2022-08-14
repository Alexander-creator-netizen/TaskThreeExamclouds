package taskThreeExamclouds;

/**
 * Contains a method that takes an array as an argument and
 * subsequently provides information about each element of this array.
 *
 * @author Alex Krentik
 * @data 14.08.2022
 */

public class VetClinic {

    public void medicalReception(Animal[] animals) {

        for (Animal animalsArray: animals) {
            System.out.println(animalsArray.toString());
            animalsArray.medicalExpenses();
            System.out.println();
        }
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
