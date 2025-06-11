package spark_batch.basic_projects.verifier;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String, Aadhaar> aadhaarMap = new HashMap<>();

    static {
        aadhaarMap.put("1232332234", new Aadhaar("1232332234", "Ashu", "Abhi", "Agra"));
        aadhaarMap.put("1232332235", new Aadhaar("1232332235", "Ashui", "Abhinav", "BBSR"));
        aadhaarMap.put("1232332233", new Aadhaar("1232332233", "Ashutosh", "Abhijit", "Delhi"));
        aadhaarMap.put("1232332232", new Aadhaar("1232332232", "Ashura", "Abhishek", "Bengaluru"));
        aadhaarMap.put("1232332231", new Aadhaar("1232332231", "Ashutoshi", "Abhira", "Hyderabad"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber) {
        return aadhaarMap.get(aadhaarNumber);
    }
}
