package oop.kembar;

public class Service{


	public String cari(){
		return "dari kelas service no parameter";	
	}

	public String cari(String value){
		return "dari kelas service single parameter";
	}

	public void cari(Integer intValue){
		System.out.println(
			"dari kelas service single parameter int no retrun value");
	}

	public void cari(String value, Integer intValue){
		System.out.println(
			"dari kelas service with string and int params no retrun value");
	}

	public void cari(Integer intValue, String stringValue){
		System.out.println(
			"dari kelas service with int and string params no retrun value");
	
	}

	public void cari(Integer intValue, String stringValue, Boolean booleanValue){
		System.out.println(
			"dari kelas service with int, string, and boolean params no retrun value");
	}


}
