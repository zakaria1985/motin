package linklist;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class UseListHashMap {

	public static void main(String[] args) {
		List<String>cityofUSA = new ArrayList<String>();
		
		cityofUSA.add("NY");
		cityofUSA.add("CA");
		cityofUSA.add("FL");
		
		
		
List<String>cityofCanada = new ArrayList<String>();
		
		cityofCanada.add("montrial");
		cityofCanada.add("Toranto");
		cityofCanada.add("vancover");
		
		
List<String>cityofUK = new ArrayList<String>();

		cityofUK.add("Menchester");
		cityofUK.add("London");
		
		
		Map<String,List< String>> map =new LinkedHashMap<String,List<String>>();
		map.put("USA", cityofUSA);
		map.put("Canada", cityofCanada);
		map.put("Uk", cityofUK);
		
		
		for(Entry<String,List<String>> country:map.entrySet()) {
			
			System.out.println(country.getKey()+ " " +country.getValue());
		}



	}

}
