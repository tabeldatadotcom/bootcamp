public class DeepDiveIfStatement{

	public static void main(String[] args){
		Float ipk = 1.8f;
		if(ipk <= 4 && ipk >= 3.5){
			System.out.println("Grade A");
		} else if (ipk <=3.4 && ipk >= 2.8){
			System.out.println("Grade B");
		} else if (ipk <= 2.7 && ipk >= 2.0)
			System.out.println("Grade C");
		 else 
			System.out.println("Grade E");

		boolean active = true;
		if(!active == false){
			System.out.println("Yang ini benar");
		}else if (active){
			System.out.println("Yang ini benar sekali");
		}else {
			System.out.println("Yang ini salah");
		}
	}

}
