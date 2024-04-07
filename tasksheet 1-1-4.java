import java.util.Scanner;

public class TaskSheet1_1_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the student score mark: ");
		double score = scan.nextDouble();

		if(score >= 90){
			System.out.println("Excellent: You got A Grade");
		}else if(score < 90 && score >= 80){
			System.out.println("Very Good: You got B Grade");
		}else if(score < 80 && score >= 70){
			System.out.println("Good: You got C Grade");
		}else if(score < 70 && score >= 60){
			System.out.println("Satisfactory: You got D Grade");
		}else {
			System.out.println("Sorry you Failed.");
		}
	}
