
public class PracticeGrading {

	public static void main(String[] args) {
		
	
//		Below is an array with 5 scores: Math, English, Science, History, and Art, respectively. 
//
//		int [] arr = {95, 85, 62, 40, 79}; <br />
//		(Copy this array into your main method) 
//
//
//		Write a program that converts the score into a letter grade. Be sure to print the subject beside the score so the student knows what each grade is for!
//
//		Grading scale: <br />
//		A: between 90 - 100 <br />
//		B: between 80 - 89 <br />
//		C: between 70 - 79 <br />
//		D: betwene 60 - 69 <br />
//		F: 59 and under
//
//
//		Example output: 
//		Printed to console: 
//		Math: A
//		English: B
//		Science: D
		
		int [] arr = {95, 85, 62, 40, 79};
		for (int i: arr) {
			System.out.println(i);
		{
			if (i < 60);{
				System.out.println("History: F");
			}
			if (i >= 60 && i <= 69);{
				System.out.println("Science: D");
			}
			if (i >= 70 && i <= 79); {
				System.out.println("Art: C");
			}
				
			if (i >= 80 && i <= 89); {
				System.out.println("English: B");
			}
					
			if (i >= 90); {
				System.out.println("Math A");
			}
		}
	}
	}
}
