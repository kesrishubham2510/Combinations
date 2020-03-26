import java.util.Scanner;

public class Driver_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a String");
		String input_String=sc.nextLine();
		
		Possible_Combinations Result = new Possible_Combinations(input_String);
	}

}
