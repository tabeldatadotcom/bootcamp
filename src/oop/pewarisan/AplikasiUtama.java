package oop.pewarisan;

public class AplikasiUtama {

	public static void main(String[] args){
		Motor honda = new Motor();
		System.out.println(honda.getKeterangan());

		Sepeda ontel = new Sepeda();
		System.out.println(ontel.roda);
		
	}
}
