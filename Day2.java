import java.util.Scanner;

public class Day2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paper = 0;
		int ribbon = 0;
		
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			String lInput = "";
			String wInput = "";
			String hInput = "";
			int index = 0;
			int i = 0;
			while (i != input.length()) {
				if (input.charAt(i) != 'x') {
					if (index == 0) lInput = lInput + input.charAt(i);
					else if (index == 1) wInput = wInput + input.charAt(i);
					else if (index == 2) hInput = hInput + input.charAt(i);
				}
				else index++;
				i++;
			}
			int l = Integer.parseInt(lInput);
			int w = Integer.parseInt(wInput);
			int h = Integer.parseInt(hInput);
			//System.out.println(l + " " + w + " " + h);
			paper += wrapPaper(l, w, h);
			ribbon += ribbon(l, w, h);
			
		}
		System.out.println("Paper: " + paper);
		System.out.println("Ribbon: " + ribbon);
		
		sc.close();
	}
	
	public static int wrapPaper(int l, int w, int h) {
		int res = 2 * l * w + 2 * w * h + 2 * h * l;
		int extra = 0;
		extra = l * w;
		if (w * h < extra) extra = w * h;
		if (h * l < extra) extra = h * l;
		return res + extra;
	}
	
	public static int ribbon(int l, int w, int h) {
		int tmp = 0;
		tmp = (l + w) * 2;
		if ((w + h) * 2 < tmp) tmp = (w + h) * 2;
		if ((h + l) * 2 < tmp) tmp = (h + l) * 2;
		tmp += l * w * h;
		return tmp;
	}
}
