import java.security.*;
import java.util.Scanner;

public class Day4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		String input = sc.next();
		
		MessageDigest md;
		try {
			
			int bruteforce = 10000;
			String bruteforceString = String.valueOf(bruteforce);
			while (true) {
				md = MessageDigest.getInstance("MD5");
				md.reset();
				String tmp = input + bruteforceString;

				md.update(tmp.getBytes());
				byte[] digest = md.digest();

				String hash = "";
				for (int i = 0; i < digest.length; i++) {
					hash += String.format("%02x", digest[i]);
				}

				//UNCOMMENT to get answer for first half of puzzle
				 
				/*if (hash.substring(0, 5).equals("00000")) {
					System.out.println("We were looking for: " + bruteforceString);
					break;
				}*/
				if (hash.substring(0, 6).equals("000000")) {
					System.out.println("We were looking for: " + bruteforceString);
					break;
				}

				bruteforce++;
				bruteforceString = String.valueOf(bruteforce);

			}
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		sc.close();
	}
}
