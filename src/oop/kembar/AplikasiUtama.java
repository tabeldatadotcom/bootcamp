package oop.kembar;

public class AplikasiUtama{


	public static void main(String[] ag){
		MahasiswaService service = new Service();
		System.out.println(service.cari());

		//service.cari(10);

		//service.cari();
	}
}
