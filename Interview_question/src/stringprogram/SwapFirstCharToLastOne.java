package stringprogram;

public class SwapFirstCharToLastOne {

	public static void main(String[] args) {
		// we need to swap first latter to last latter
		String s="i am indian";
		String s1="";
		s1+=s.charAt(s.length()-1);
		for(int i=1;i<s.length()-1;i++) {
			s1+=s.charAt(i);
		}
   s1+=s.charAt(0);
   System.out.println(s1);

	}

}
