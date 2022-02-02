package ChinmayaHospitals.OPcount;

import ChinmayaHospitals.DataLoader.DataLoader;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class OPCount {
    DataLoader dataLoader = new DataLoader();

    @Test
    public void calculatePatientsPercentageFromBangalore()
    {
        //Arrange
        int numberOfPatientsFromBangalore=0;
        int totalPatients=dataLoader.getData().getInt("size()");

        for (int i = 0; i < totalPatients; i++) {

            if(dataLoader.getData().getString("[" +i+ "].BaseLocation").equalsIgnoreCase("Bangalore")) {
                numberOfPatientsFromBangalore++;
            }
        }
        //Act - Calculating the Percentages
        double percentageOfPatientsFromBangalore =  ((double) numberOfPatientsFromBangalore / totalPatients) * 100;
        double perentageOfPatientsOutsideBangalore=100-percentageOfPatientsFromBangalore;

        //Assert  - Assuming there should be atleast 20-40% patients should be from outside Bangalore
        assertThat(perentageOfPatientsOutsideBangalore).isBetween(20.00,40.00);

       /* System.out.println("Percentage Of Local Patients: " +  percentageOfPatientsFromBangalore);
       System.out.println("Percentage Of OutStation Patients: " + (100 - percentageOfPatientsFromBangalore));*/

    }
}
