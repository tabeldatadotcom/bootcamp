package oop.kelas;

public class OopDenganKelas {

	public static void main(String[] args){
	
		Sepeda baru = new Sepeda();
		System.out.println(baru);
		baru.setKecepatanSekarang(null);
		System.out.println("Kecepatan sepeda baru adalah " + 
			baru.getKecepatanSekarang()
		);

		baru = new Sepeda();
		System.out.println(baru);
		baru.setKecepatanSekarang(120);
		System.out.println("2. Kecepatan sepeda baru adalah " + 
			baru.getKecepatanSekarang() 
		);
	}

}
