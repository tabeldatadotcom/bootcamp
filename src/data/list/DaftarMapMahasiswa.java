package data.list;

import java.util.*;
import java.math.BigDecimal;

public class DaftarMapMahasiswa{

	public static void main(String[] args){
		Map<String, Object> mapped = new HashMap<>();
		mapped.put("000", false);
		mapped.put("007", 10d);
		mapped.put("004", new BigDecimal(1000));
		mapped.put("002", "Dimas Maryanto");

		System.out.println(mapped.get("004")+ " ke yang 004");

		for(Object value : mapped.values()){
			System.out.println(value+" nilai value ");
		}

		for(String value : mapped.keySet()){
			System.out.println(value +" nilai key");
		}

		for(Map.Entry<String, Object> entry : mapped.entrySet()){
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

		mapped.forEach((k, v) -> {
			System.out.println(k + "/" + v);
		});

	}
}
