import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String vhod = sc.next();
		int floor = 0;
		int basement = 0;
		
		int leng = vhod.length();
		for (int i = 0; i < leng; i++) {
			char current = vhod.charAt(i);
			if (current == '(') floor++;
			else floor--;
			if (floor == -1 && basement == 0) basement = i + 1;
		}
		
		System.out.println(floor);
		System.out.println("First time in basement: " + basement);
		
		sc.close();
	}

}
