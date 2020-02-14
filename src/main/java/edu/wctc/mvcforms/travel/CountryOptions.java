package edu.wctc.mvcforms.travel;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountryOptions {
    private Map<String, String> countryOptions;

    public CountryOptions() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("CA", "Canada");
        countryOptions.put("JP", "Japan");
        countryOptions.put("US", "United States");
    }

    public Map<String, String> getCountryOptions() {
        return countryOptions;
    }

}
