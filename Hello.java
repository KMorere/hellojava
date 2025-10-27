import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Quel est votre nom ?");
		
		Scanner reader = new Scanner(System.in);
		String input = reader.next();

		System.out.println("Bonjour, " + input);
		
		reader.close();
	}

}
