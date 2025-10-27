import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int value = 0;
		
		if(args.length > 0) {
			value = java.lang.Integer.parseInt(args[0].trim());
		
			ValueCheck(value);
		}
		else
			System.out.println("No entered numbers !");
		
		reader.close();
	}
	
	public static void ValueCheck(int _value) {
		if(_value != 0) {
			if(_value > 0)
				System.out.print(_value + " is positive");
			else if (_value < 0)
				System.out.print(_value + " is negative");
			
			if(_value % 2 == 0)
				System.out.println(" and even.");
			else if(_value % 2 != 0)
				System.out.println(" and odd.");
		}
		else
			System.out.println(_value + " is zero.");

	}
}
