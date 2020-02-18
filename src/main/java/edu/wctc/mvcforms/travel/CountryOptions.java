package edu.wctc.mvcforms.travel;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountryOptions {
    private Map<String, String> map;

    public CountryOptions() {
        map = new LinkedHashMap<>();
        map.put("BR", "Brazil");
        map.put("FR", "France");
        map.put("CA", "Canada");
        map.put("JP", "Japan");
        map.put("US", "United States");
    }

    public Map<String, String> getMap() {
        return map;
    }

}
