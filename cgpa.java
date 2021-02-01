package practice;
import java.util.Scanner;
import java.util.ArrayList;

public class cgpa {

	public static void main(String[] args) {
		int deadLine = 1;
		float totalGpa=0;
		int totalCredits=0;
		float CGPA=0;
		ArrayList<Integer> myCredits = new ArrayList<Integer>();
		ArrayList<Float> myGpa = new ArrayList<Float>();
		
		while (deadLine!=0) {
			System.out.println("Enter the credit number:");
			System.out.println("(If you want to finish then press 0)");
			
			Scanner credit = new Scanner(System.in);
			int creditNum = credit.nextInt(); 
			deadLine= creditNum;
			if(creditNum==0) {
				break;
			}
			myCredits.add(creditNum);			
			System.out.println("Enter the gpa number:");
			Scanner gpa = new Scanner(System.in); 
			float gpaNum = gpa.nextFloat(); 
			myGpa.add(gpaNum);
		}
		for (int i=0; i<myCredits.size(); i++) {
			totalGpa=totalGpa+(myCredits.get(i)*myGpa.get(i));	
			totalCredits = totalCredits+myCredits.get(i);
		}
		System.out.println(myCredits);
		System.out.println(myGpa);
		
		CGPA = totalGpa/totalCredits;
		System.out.println("Your CGPA is : "+ CGPA);		
	}
}
