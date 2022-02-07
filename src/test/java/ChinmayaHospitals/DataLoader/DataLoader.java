package ChinmayaHospitals.DataLoader;

import ChinmayaHospitals.OP.Patient;
import ChinmayaHospitals.OP.Doctor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DataLoader {
    List<Patient> patientList = new ArrayList<>();

    public void loadData()
    {
        Calendar calendar = Calendar.getInstance();
        Doctor doctor1 = Doctor.builder()
                .visitDate(calendar.getTime())
                .visitingDoctorName("Krishna")
                .build();

        Doctor doctor2= Doctor.builder()
                .visitDate(calendar.getTime())
                .visitingDoctorName("Kumar")
                .build();

        Doctor doctor3= Doctor.builder()
                .visitDate(calendar.getTime())
                .visitingDoctorName("Rani")
                .build();

        patientList.add(Patient.builder().name("Abhilash").location("Bangalore").visitInfo(doctor1).build());
        patientList.add(Patient.builder().name("Karthik").location("Tumkur").visitInfo(doctor2).build());
        patientList.add(Patient.builder().name("Krishna").location("Nandi Hills").visitInfo(doctor3).build());
        patientList.add(Patient.builder().name("Kumaran").location("Bangalore").visitInfo(doctor2).build());
        patientList.add(Patient.builder().name("Kailash").location("Bangalore").visitInfo(doctor1).build());
    }
    public List<Patient> getPatientsData()
    {
        return this.patientList;
    }
}
