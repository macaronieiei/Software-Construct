package lap2;

import java.util.Scanner;

public class lap203 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter started day : ");
		int start = scanner.nextInt();
		//System.out.print("Su\t Mo\t Tu\t We\t Th\t Fr\t Sa\t \n");
		//Tam beb nee kor dai tae man beaw i cant breath
		
		String week[]= {"Su","Mo","Tu","We","Th","Fr","Sa"};
		for(int j=0; j<7; j++)
			System.out.print(week[j]+"\t");
		
		System.out.println();
		for(int i=0; i<start-1; i++)/*or i=1; i<start*/ {
			System.out.print("\t");
		}
		for(int day = 1; day<=31; day++) {
			System.out.print(day + "\t");
			if((((start-1)+day)%7)==0)
				System.out.print("\n");
		}
	}
}