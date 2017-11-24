package oop.pewarisan.multi;

public class Zx10R implements SportBike {

   	public boolean raceMode(){
		return true;
	}

	public void halo(){
		System.out.println("lsadkfjlksdajf");
	}

	public static void main(String[] args){
		Zx10R kawasaki = new Zx10R();
		System.out.println(kawasaki.toString());
		kawasaki.halo();
	}
	
	@Override
	public String toString(){
		return String.format(
			"{ ktrc: %s, abs: %s, engineBlock: %s, cylinder: %s, raceMode: %s }", 
			KTRC, ABS, ENGINE_BLOK, ABS, this.raceMode()
		);
	}
}
