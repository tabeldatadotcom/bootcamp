package data;

public class DataArray{

	public static void main(String[] arg){
		String[] peserta = new String[10];

		peserta[0] = "Dimas Maryanto";
		for(int i = 0; i < peserta.length; i ++){
			System.out.println(peserta[i]+" index ke " + i);
		}

		System.out.println("----------------------");

		peserta[3] = "Adyo";

		for(int i = 0; i < peserta.length; i ++){
			System.out.println(peserta[i] +" index ke " + i);
		}
	}
	
}
