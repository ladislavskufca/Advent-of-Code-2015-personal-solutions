import java.util.Scanner;
public class Day5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int count = 0;
		
		while (sc.hasNext()) {
			String input = sc.next();

			
			//PART ONE
			/*int vowels = 0;
			boolean twice = false;
			boolean notDirty = true;
			
			for (int i = 0; i < input.length() - 1; i++) {
				
				char tmp = input.charAt(i);
				char tmpNext = input.charAt(i + 1);
				
				if (tmp == 'a' || tmp == 'e' || tmp == 'i' || tmp == 'o' || tmp == 'u') {
					vowels++;
				}
				
				if (i == input.length() - 2) {
					if (tmpNext == 'a' || tmpNext == 'e' || tmpNext == 'i' || tmpNext == 'o' || tmpNext == 'u') {
						vowels++;
					}	
				}
				
				if (tmp == tmpNext) twice = true;
				
				String dirty = "" + tmp + tmpNext;
				if (dirty.equals("ab") || dirty.equals("cd") || dirty.equals("pq") || dirty.equals("xy")) notDirty = false;
				
			}
			
			if (vowels > 2 && twice && notDirty) count ++;*/
			
			
			//PART TWO

			boolean twice = false;
			boolean triple = false;
			
			for (int i = 0; i < input.length() - 2; i++) {
				
				char tmp = input.charAt(i);
				char tmpNextNext = input.charAt(i + 2);
				
				if (tmp == tmpNextNext) {
					triple = true;
					break;
				}
				
			}
			
			for (int i = 0; i < input.length() - 1; i++) {
				
				char tmp = input.charAt(i);
				char tmpNext = input.charAt(i + 1);	
				
				for (int j = i + 2; j < input.length() - 1; j++) {
					char tmpD = input.charAt(j);
					char tmpNextD = input.charAt(j + 1);
					
					if (tmp == tmpD && tmpNext == tmpNextD) twice = true;
					
				}					
			}
			
			if (twice && triple) count++;
			
		}
		
		System.out.println("How many strings are nice? " + count);
		
		sc.close();
	}	
}
