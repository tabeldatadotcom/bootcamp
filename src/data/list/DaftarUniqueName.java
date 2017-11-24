package data.list;

import java.util.*;

public class DaftarUniqueName {

	public static void main(String[] args){
		Set<Object> values = new HashSet<>();

		values.add(1);
		values.add("Value");
		values.add(11);
		values.add(false);
		values.add(10);

		values.remove(2);

		System.out.println("Jumlah dari element set adalah " + values.size());

		for(Object value : values) { System.out.println(value); }

		values.forEach( (Object index) -> {
			System.out.println(index);
		} );
	}
}
