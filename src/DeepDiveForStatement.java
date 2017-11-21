public class DeepDiveForStatement{
	
	/**
		ini komentar baris pertama
		ini komter baris ke 2
	*/
	public static void main(String[] args){
		// ini komentar
		Integer inc = 0;
		for(inc = 0; i < 5; inc++){
			inc++;
			for(int j = 0; j < inc; j++){
				System.out.print(j);			
			}
			System.out.println();
		}

		for(inc = 0; i < 10; inc++){
			inc++;
			if(i % 2 == 0){
				System.out.println("bilangan genap "+ inc);
			}		
		}
		System.out.println(inc);

	}
}
