import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[][] table = new int[input.length() + 1][input.length() + 1];

		int x = input.length()/2;
		int y = input.length()/2;
		table[x][y]++;
		
		int xR = input.length()/2;
		int yR = input.length()/2;
		table[xR][yR]++;
		
		for (int i = 0; i < input.length(); i++) {
			char current = input.charAt(i);
			if (current == '>') {
				//right
				if (i % 2 == 0) {
					x++;
					table[x][y]++;
				}
				else {
					//robo version
					xR++;
					table[xR][yR]++;
				}
			}
			else if (current == '<') {
				//left
				if (i % 2 == 0) {
					x--;
					table[x][y]++;
				}
				else {
					//robo version
					xR--;
					table[xR][yR]++;
				}
			}
			else if (current == '^') {
				//top
				if (i % 2 == 0) {
					y++;
					table[x][y]++;
				}
				else {
					//robo version
					yR++;
					table[xR][yR]++;
				}
			}
			else {
				//bot
				if (i % 2 == 0) {
					y--;
					table[x][y]++;
				}
				else {
					//robo version
					yR--;
					table[xR][yR]++;
				}
			}
		}
		
		int count = 0;
		//check houses
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (table[i][j] >= 1) count++;
			}
		}
		
		System.out.println("Houses visited: " + count);
		
		sc.close();
	}
}
