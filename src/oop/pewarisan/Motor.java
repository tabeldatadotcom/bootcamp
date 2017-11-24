package oop.pewarisan;

public class Motor extends Sepeda {

	private String knalpot = "Racing";

	public String getNamaKnalpot(){
		return this.knalpot;
	}

	public void setNamaKnalpot(String value){
		this.knalpot = value;
	}

	public String getKeterangan(){
		return "jumlah roda pada motor " + super.getRoda();
	}

	
}
