package stringprogram;

public class ReverseEachword {

	public static void main(String[] args) {
		// reverse each word in a string.
		
		String s = "my name is shila i got marrige with drig";
		String[] sa = s.split(" ");
		for (int i = 0; i < sa.length; i++) {
			String word = sa[i];
			String reverse=" ";
			for(int j=word.length()-1;j>=0;j--) {
				reverse+=word.charAt(j);
			}
			System.out.print(reverse+" ");
		}
		

}
}