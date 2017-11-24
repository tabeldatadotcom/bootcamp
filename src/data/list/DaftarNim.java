package data.list;

import java.util.List;
import java.util.ArrayList;

public class DaftarNim{

	public static void main(String[] args){
		List<String> values = new ArrayList<>();
		values.add("1051234");
		values.add("1051234");
		values.add("1601234");

		// untuk mengambil jumlah ada
		System.out.println("Jumlah data pada array adalah " + 
					values.size()); 

		for(int i = 0; i < values.size(); i ++){
			System.out.println(values.get(i));
		}
	}
}
