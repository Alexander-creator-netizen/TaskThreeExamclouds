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

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
            animals[i].medicalExpenses();
            System.out.println();
        }
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
