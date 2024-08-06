package lap2;
import java.util.Scanner;
public class lap204 {

	public static void main(String[] args) {
		System.out.print("Enter sentence : ");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		//String[] words = text.split(" ");
		//String[] text = (scanner.nextLine()).split(" ");
		
		String newText = text.replaceAll("happy", "happy :)".replaceAll("sad", "sad :()"));
		System.out.print(newText);
	}
}