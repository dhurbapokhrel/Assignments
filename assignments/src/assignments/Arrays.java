package assignments;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

			int Br []= new int[5];
			int Ar [] =new int [5];
			Ar[0] = 5;
			Ar[1] = 10;
			Ar[2] = 15;
			Ar[3] = 20;
			Ar[4] = 25;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter numbers you want to store in Array.");

			for(int i =0; i<Br.length; i++) {
				
				Br[i] =sc.nextInt();
				
			}
		
	}
}