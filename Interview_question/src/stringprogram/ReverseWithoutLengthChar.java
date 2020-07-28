package stringprogram;

public class ReverseWithoutLengthChar {

	public static void main(String[] args) {
		reversewithoutCharAt();
		System.out.println();
		reverseOddIndex();
	}

	private static void reverseOddIndex() {
		//reverse odd index word in an String
		String ss="my native place is hanumana and sasural in chapgawan";
		String[] s=ss.split(" ");
		for(int i=1;i<s.length;i+=2) {
			String word=s[i];
			String reverse=" ";
			for(int j=word.length()-1;j>=0;j--) {
				reverse+=word.charAt(j);
			}
			System.out.print(reverse);
			
		}
	}
	private static void reversewithoutCharAt() {
		//reverse without using length() and CharAt();
	      String s="i am software engineer in transneuron company";
	      char[] ch=s.toCharArray();
	      for(int i=ch.length-1;i>=0;i--) {
	    	  System.out.print(ch[i]);
	      }
	}

}
