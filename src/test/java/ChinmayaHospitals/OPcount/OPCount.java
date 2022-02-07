package ChinmayaHospitals.OPcount;

import ChinmayaHospitals.DataLoader.DataLoader;
import ChinmayaHospitals.OP.Hospital;
import org.testng.annotations.Test;

public class OPCount {
    DataLoader dataLoader = new DataLoader();

    @Test
    public void twosasdfadf()
    {
        //Arrange
        Hospital hospital = Hospital.builder()
                .name("Chinmaya Hospitals")
                .location("Bangalore")
                .build();
        dataLoader.loadData();

        //Act
        int bangalorePatientsCount = (int) dataLoader.getPatientsData().stream().filter(p->p.getLocation().equalsIgnoreCase(hospital.getLocation())).count();
        int outStationPatientsCount= dataLoader.getPatientsData().size()-bangalorePatientsCount;

        System.out.println("Patients From Bangalore: "+getPatientsVisitPercentage(bangalorePatientsCount));
        System.out.println("Patients From Ouside: "+getPatientsVisitPercentage(outStationPatientsCount));

    }

    Double getPatientsVisitPercentage(Integer visitorsByLocationCount)
    {
        return  Double.valueOf(visitorsByLocationCount * 100 / dataLoader.getPatientsData().size());
    }
}
