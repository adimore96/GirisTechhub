//Grade Calculator from percentage

public class GradeCalculator{
	public static void main(String args[]){
		int maths=45, sci=60, eng=92;
		int per = (maths+sci+eng)/3;
		
		if(per>90){
			System.out.println("Grade A");
		}
		else if(per>70 && per<=90){
			System.out.println("Grade B");
		}
		else if(per>45 && per<=70){
			System.out.println("Grade C");
		}
		else if(per>=28 && per<=45){
			System.out.println("Grade D");
		}
		else{
			System.out.println("Grade F");
		}
	}
}