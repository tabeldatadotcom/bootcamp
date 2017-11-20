public class LogikaBoolean{
	
	public static void main(String[] args){
		Boolean active = false;
		Boolean notActive = false;
		System.out.println(
			"Nilai boolean adalah " + 
			active + 
			" sama  " + 
			notActive); 

		System.out.println(
			"Nilai dari variable active adalah true : " + 
			(active ? "Ya nilanya benar" : "Gak nilainya salah")
		);
	}
}
