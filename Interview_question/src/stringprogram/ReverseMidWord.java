package stringprogram;

public class ReverseMidWord {

	public static void main(String[] args) {
		// reverse mid word in a given String
		//because array start with 0 for when our mid word will be 3, for array it will be 2 only.
		
		String s = "my name is shila patel";
		String reverse = "";
		String[] sw = s.split(" ");
		int mid = sw.length / 2;
	//	System.out.println(mid);
		for (int i = 0; i < sw.length; i++) {
			if (mid == i && sw.length % 2 != 0) {
				String word = sw[i];
				for (int j = word.length() - 1; j >= 0; j--) {
					reverse += word.charAt(j);
				}
				System.out.println(reverse);
			}
		}

	}

}
