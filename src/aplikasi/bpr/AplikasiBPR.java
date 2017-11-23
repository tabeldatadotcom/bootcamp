package aplikasi.bpr;

import aplikasi.bpr.service.*;

public class AplikasiBPR {

	public static void main(String[] args){
		AplikasiTabunganBPR tabungan = new AplikasiTabunganBPR();
		System.out.println(tabungan.saldoNasabah());
	}
}
