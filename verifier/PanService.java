package spark_batch.basic_projects.verifier;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String, Pan> panMap = new HashMap<>();

    static {
        panMap.put("ABCD1080AA", new Pan("ABCD1080AA", "1232332234", "HDFC", "Stocks"));
        panMap.put("ABCD1080AB", new Pan("ABCD1080AB", "1232332235", "ICICI", "Stocks, ELSS"));
        panMap.put("ABCD1080AC", new Pan("ABCD1080AC", "1232332233", "SBI", "Stocks, FD"));
        panMap.put("ABCD1080AD", new Pan("ABCD1080AD", "1232332232", "HDFC", "Nill"));
        panMap.put("ABCD1080AE", new Pan("ABCD1080AE", "1232332231", "BOI", "ELSS, FD, Nifty50"));
    }

    public Pan getPanByAadhaar(String aadhaarNumber) {
        for (Pan pan : panMap.values()) {
            if (pan.getAadhaarNumber().equals(aadhaarNumber)) return pan;
        }
        return null;
    }
}
