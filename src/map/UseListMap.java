package map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseListMap {

	public static void main(String[] args) {
		List<String> cityOfUSA = new ArrayList<String>();
		cityOfUSA.add("NY");
		cityOfUSA.add("CA");
		cityOfUSA.add("AZ");
		cityOfUSA.add("FL");
		cityOfUSA.add("MA");
		cityOfUSA.add("CO");
		
		List<String> cityOfUK = new ArrayList<String>();
		cityOfUK.add("London");
		cityOfUK.add("Scotland");
		cityOfUK.add("Manchester");
		cityOfUK.add("Wales");
		cityOfUK.add("Edinburgh");
		
		
		List<String> cityOfCanada = new ArrayList<String>();
		cityOfCanada.add("Toronto");
		cityOfCanada.add("Nova Scotia");
		cityOfCanada.add("Alberta");
		cityOfCanada.add("Quebeck");
		
		
		List<String> cityOfAustralia = new ArrayList<String>();
		cityOfAustralia.add("Sydney");
		cityOfAustralia.add("Canbera");
		cityOfAustralia.add("Brisban");
		cityOfAustralia.add("WestLand");
		
		List<String> cityOfJapan = new ArrayList<String>();
		cityOfJapan.add("Tokyo");
		cityOfJapan.add("Naga Saki");
		cityOfJapan.add("Osaka");
		
		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
		map.put("USA", cityOfUSA);
		map.put("Canada", cityOfCanada);
		map.put("Australia", cityOfAustralia);
		map.put("Japan", cityOfJapan);
		map.put("UK", cityOfUK);
		
		for(Map.Entry<String, List<String>> entry:map.entrySet()) {
			System.out.println(entry.getKey()+ " ---> "+ entry.getValue());
		}
		

	}

}
