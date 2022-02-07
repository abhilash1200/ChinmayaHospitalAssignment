package ChinmayaHospitals.OP;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class Patient {
    private String name;
    private String location;
    private Doctor visitInfo;
}
