import java.time.LocalDate;

public class FunctionDeclaration {

	public static void main(String[] x){
		hitungDeposito();
		System.out.println(tanggalHariIni());
		//System.out.println(hitungPersegiPanjang());
		System.out.println("hitung persegi dengan sisi = 6 maka hasilnya " + hitungPersegi(6));
		System.out.println("hitung persegi dengan sisi = 20 maka hasilnya " + 
			hitungPersegi(
				umurSaya()
			)
		);

		System.out.println(
			"hitung luas persegi panjang dengan lebar = 10 dan panjang = 25 maka hasilnya adalah " + 
			hitungLuasPersegiPanjang(25, 10)
		);

	} 

	private static Integer hitungPersegi(Integer sisi){
		return sisi * sisi;
	}

	public static Integer hitungLuasPersegiPanjang(Integer panjang, Integer lebar){
		return panjang * lebar;
	}

	private static void hitungDeposito(){
		System.out.println("Halo saya dari method hitungDeposito()");
	}

	private static LocalDate tanggalHariIni(){
		LocalDate tanggal = LocalDate.now();
		return tanggal;
	}

	private static Integer umurSaya(){
		return 20;
	}



}
