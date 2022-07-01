package PracPackage;

public class SumOfArr {{
	int sum = 0;
	int LengthOfParr = Parr.length;
	for(int i = 0; i < LengthOfParr ; i++) {
		sum = sum + Parr[i];
	}
	return sum;
	
}

	

	public static void main(String[] arg ) {
		int [] Parr = new int[6];
		int sum = 0;
		int LengthOfParr = Parr.length;
		
		
		Parr[0] = 1;
		Parr[1] = 2;
		Parr[2] = 3;
		Parr[3] = 4;
		Parr[4] = 5;
		Parr[5] = 6;
		
		for(int i = 0; i < LengthOfParr ; i++) {
			sum = sum + Parr[i];
			
			System.out.print(sum);
		}
	}
}
