package oop.pewarisan;

public class Motor extends Sepeda {

	private String knalpot = "Racing";

	public String getNamaKnalpot(){
		return this.knalpot;
	}

	public String getKeterangan(){
		return "jumlah roda pada motor " + super.roda;
	}

	
}
