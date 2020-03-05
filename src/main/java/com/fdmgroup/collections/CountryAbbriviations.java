package com.fdmgroup.collections;

import java.util.HashMap;
import java.util.Map;

public class CountryAbbriviations {

	public static void main(String[] args) {

		Map<String, String> mapAbbriviation = new HashMap<>();
		
		mapAbbriviation.put("UK", "United Kinkdom");
		mapAbbriviation.put("US", "United States");
		mapAbbriviation.put("FR", "France");
		mapAbbriviation.put("GER", "Germany");
		mapAbbriviation.put("IT", "Italy");
		
		System.out.println(getCountryByAbbreviation("us", mapAbbriviation));
		System.out.println(getCountryByAbbreviation("xxx", mapAbbriviation));
		
	}
	
	public static String getCountryByAbbreviation(String abbreviation, Map<String, String> mapAbbreviation) {
		if (!mapAbbreviation.containsKey(abbreviation.toUpperCase())) {
			return "Country not in list";
		}
		return mapAbbreviation.get(abbreviation.toUpperCase());
			
	}
		
	
}		
