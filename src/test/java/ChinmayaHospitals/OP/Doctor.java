package ChinmayaHospitals.OP;

import lombok.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Builder
public class Doctor {
    private Date visitDate;
    private String visitingDoctorName;
}
