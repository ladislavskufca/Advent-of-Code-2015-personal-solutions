import java.util.Scanner;

public class Day6 {
	
	public static final int[][] lights = new int[1000][1000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		
		
		
		while (sc.hasNext()) {
			String input = sc.nextLine();
			String[] parse = input.split(" ");
			
			if (input.substring(0, 6).equals("toggle")) {
				String[] from = parse[1].split(",");
				String[] to = parse[3].split(",");
				toggle(from, to);
			}
			else {
				if (input.substring(5, 7).equals("on")) {
					String[] from = parse[2].split(",");
					String[] to = parse[4].split(",");
					turnOn(from, to);		
				}
				else {
					String[] from = parse[2].split(",");
					String[] to = parse[4].split(",");
					turnOff(from, to);	
				}
			}
			
		}
		
		int count = 0;
		
		for (int i = 0; i < lights.length; i++) {
			for (int j = 0; j < lights[i].length; j++) {
				if (lights[i][j] == 1) count++;
			}
		}
		
		System.out.println("How many lights are lit? " + count);
		
		sc.close();
	}
	
	private static void toggle(String[] from, String[] to) {
		int fromX = Integer.parseInt(from[0]);
		int fromY = Integer.parseInt(from[1]);
		int toX = Integer.parseInt(to[0]);
		int toY = Integer.parseInt(to[1]);
		
		for (int i = fromX; i <= toX; i++) {
			for (int j = fromY; j <= toY; j++) {
				if (lights[i][j] == 1) lights[i][j] = 0;
				else lights[i][j] = 1;
			}
		}
	}
	
	private static void turnOn(String[] from, String[] to) {
		int fromX = Integer.parseInt(from[0]);
		int fromY = Integer.parseInt(from[1]);
		int toX = Integer.parseInt(to[0]);
		int toY = Integer.parseInt(to[1]);
		
		for (int i = fromX; i <= toX; i++) {
			for (int j = fromY; j <= toY; j++) {
				lights[i][j] = 1;
			}
		}	
	}
	
	private static void turnOff(String[] from, String[] to) {
		int fromX = Integer.parseInt(from[0]);
		int fromY = Integer.parseInt(from[1]);
		int toX = Integer.parseInt(to[0]);
		int toY = Integer.parseInt(to[1]);
		
		for (int i = fromX; i <= toX; i++) {
			for (int j = fromY; j <= toY; j++) {
				lights[i][j] = 0;
			}
		}
	}
}
