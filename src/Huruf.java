public class Huruf{
	
	public static void main(String[] args){
		String angka = "10 123 asSfsdjaiweroiw \n@ @#$%^&*(&$#$ \u00ea";
		String angka2 = "10 123 assfsdjaiweroiw \n@ @#$%^&*(&$#$ \u00ea";
		
		System.out.println(
			"jumlah karakter string adalah " + angka.length()
		);
		System.out.println(
			"nilai variable tipe data string adalahg " + 
			angka.charAt(angka.length() - 1)
		);
		boolean sama = angka.equalsIgnoreCase(angka2);
		System.out.println(sama ? "hasilnya sama" : "hasilnya beda");
	}

}
