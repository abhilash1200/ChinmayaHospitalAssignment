package ChinmayaHospitals.DataLoader;

import io.restassured.path.json.JsonPath;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DataLoader {

    public JsonPath getData() {

        String dbFile="src/test/java/ChinmayaHospitals/DataLoader/PatientDB.json";
        JsonPath jsonPath = convertJsonToJsonPath(dbFile);
        return jsonPath;
    }

    @SneakyThrows
    public JsonPath convertJsonToJsonPath(String fileName) {

        String json = new String(Files.readAllBytes(Paths.get(fileName)));
        JsonPath jsonPath = new JsonPath(json);
        return jsonPath;
    }
}
