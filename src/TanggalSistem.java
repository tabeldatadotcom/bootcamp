
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TanggalSistem {
	
	public static void main(String[] args){
		LocalDate tanggalHariIni = LocalDate.now();
		DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		System.out.println(
			"Tanggal hari ini adalah "  + 
			tanggalHariIni.format(formatWaktu) 
		);
	}
}
