package data;

public class DataArray2Dimention{

	public static class Mahasiswa{
		private String nama;
		private String nip;

		public String getNama(){ return this.nama; }
		
		public void setNama(String nama){ this.nama = nama; }

		public String getNip(){ return this.nip; }
		
		public void setNip(String x){ this.nip = x; }
	}

	public static void main(String[] args){

		Mahasiswa[] daftarMahasiswa = new Mahasiswa[5];

		Mahasiswa dimas = new Mahasiswa();
		dimas.setNama("Dimas Maryanto");
		dimas.setNip("105123123");
		daftarMahasiswa[0] = dimas;

		Mahasiswa adyo = new Mahasiswa();
		adyo.setNama("Adyo");
		adyo.setNip("10512");
		daftarMahasiswa[1] = adyo;

		for(Mahasiswa mhs : daftarMahasiswa){
			if(mhs != null)
				System.out.println(
					"Nama mahasiswa " + 
					mhs.getNama() +
					" nip nya adalah " + 
					mhs.getNip()
				);
		}


		String[][] values = { 
			{"Dimas", "Adib", "Yusuf"}, 
			{"Rega", "Nanda", "Adyo"}, 
			{"Rega", "Nanda", "Adyo"}, 
			{"Rega", "Nanda", "Adyo"} 
		};

		// System.out.println(values[1][2]);

		//for(String[] listPeserta : values){
		//	for(String peserta : listPeserta){
		//		System.out.print("Peserta " + peserta);
		//	}
		//	System.out.println();
		//}

		for(int i = 0; i < values.length; i++){
			for(int j = 0; j < values[i].length; j++){
				System.out.println(values[i][j]);
			}
			System.out.println();
		}

	}
}
