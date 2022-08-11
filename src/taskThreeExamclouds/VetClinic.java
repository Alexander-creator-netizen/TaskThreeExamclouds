package taskThreeExamclouds;

import static taskThreeExamclouds.Cure.animals;

public class VetClinic {

    void medicalReception() {

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
